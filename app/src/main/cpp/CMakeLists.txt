
# For more information about using CMake with Android Studio, read the
# documentation: https://d.android.com/studio/projects/add-native-code.html.
# For more examples on how to use CMake, see https://github.com/android/ndk-samples.

# Sets the minimum CMake version required for this project.
cmake_minimum_required(VERSION 3.22.1)
set(CMAKE_VERBOSE_MAKEFILE on)

# Declares the project name. The project name can be accessed via ${ PROJECT_NAME},
# Since this is the top level CMakeLists.txt, the project name is also accessible
# with ${CMAKE_PROJECT_NAME} (both CMake variables are in-sync within the top level
# build script scope).
project("opensc-pkcs11")

# Creates and names a library, sets it as either STATIC
# or SHARED, and provides the relative paths to its source code.
# You can define multiple libraries, and CMake builds them for you.
# Gradle automatically packages shared libraries with your APK.
#
# In this top level CMakeLists.txt, ${CMAKE_PROJECT_NAME} is used to define
# the target library name; in the sub-module's CMakeLists.txt, ${PROJECT_NAME}
# is preferred for the same purpose.
#
# In order to load a library into your app from Java/Kotlin, you must call
# System.loadLibrary() and pass the name of the library defined here;
# for GameActivity/NativeActivity derived applications, the same library name must be
# used in the AndroidManifest.xml file.

add_library( # Sets the name of the library.
        opensc-pkcs11

        # Sets the library as a shared library.
        SHARED
        eng_back.c   eng_parse.c   p11_attr.c  p11_ec.c     p11_key.c   p11_pkey.c
        eng_err.c    libpkcs11.c   p11_cert.c  p11_err.c    p11_load.c  p11_rsa.c
        eng_front.c  p11_atfork.c  p11_ckr.c   p11_front.c  p11_misc.c  p11_slot.c
        config.h   engine.h      libp11.h   p11_pthread.h
        eng_err.h  libp11-int.h  p11_err.h  pkcs11.h

        # Provides a relative path to your source file(s).
      )




set(CMAKE_FIND_ROOT_PATH_MODE_LIBRARY BOTH)
set(CMAKE_FIND_ROOT_PATH_MODE_INCLUDE BOTH)
set(CMAKE_FIND_ROOT_PATH_MODE_PACKAGE BOTH)
set(CMAKE_EXPORT_COMPILE_COMMANDS ON)

add_library( libcrypto
        STATIC
        IMPORTED )
set_target_properties( # Specifies the target library.
        libcrypto

        # Specifies the parameter you want to define.
        PROPERTIES IMPORTED_LOCATION

        # Provides the path to the library you want to import.
        ${PROJECT_SOURCE_DIR}/libs/${ANDROID_ABI}/libcrypto.a )

add_library( libssl
        STATIC
        IMPORTED )

set_target_properties( # Specifies the target library.
        libssl

        # Specifies the parameter you want to define.
        PROPERTIES IMPORTED_LOCATION

        # Provides the path to the library you want to import.
        ${PROJECT_SOURCE_DIR}/libs/${ANDROID_ABI}/libssl.a )
target_include_directories(opensc-pkcs11 PRIVATE ${PROJECT_SOURCE_DIR}/libs/${ANDROID_ABI})
target_include_directories(opensc-pkcs11 PRIVATE ${PROJECT_SOURCE_DIR})

# Searches for a specified prebuilt library and stores the path as a
# variable. Because CMake includes system libraries in the search path by
# default, you only need to specify the name of the public NDK library
# you want to add. CMake verifies that the library exists before
# completing its build.

find_library( # Sets the name of the path variable.
        log-lib

        # Specifies the name of the NDK library that
        # you want CMake to locate.
        log )

find_library( # Sets the name of the path variable.
        z-lib

        # Specifies the name of the NDK library that
        # you want CMake to locate.
        z )

# Specifies libraries CMake should link to your target library. You
# can link multiple libraries, such as libraries you define in this
# build script, prebuilt third-party libraries, or system libraries.

target_link_libraries(  # Specifies the target library.
        opensc-pkcs11

        # Links the target library to the log library
        # included in the NDK.
        ${log-lib}
        ${z-lib}
        libcrypto
        libssl)


