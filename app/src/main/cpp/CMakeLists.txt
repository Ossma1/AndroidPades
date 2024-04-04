
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

        # Provides a relative path to your source file(s).
        libopensc/reader-tr03119.c
        libopensc/libopensc.exports
        libopensc/reader-tr03119.h
        common/compat_dummy.c
        common/compat_strlcat.c
        common/compat_strlcpy.c
        common/compat_strnlen.c
        common/compat_getpass.c
        common/compat_getopt.c
        common/compat_report_rangecheckfailure.c
        common/compat___iob_func.c
        common/simclist.c
        common/libscdl.c

        scconf/scconf.c
        scconf/parse.c
        scconf/write.c
        scconf/sclex.c
        tools/fread_to_eof.c
        ui/strings.c
        ui/notify.c
        libopensc/pkcs15-sc-hsm.c

        pkcs15init/pkcs15-asepcos.c
        pkcs15init/pkcs15-authentic.c
        pkcs15init/pkcs15-cardos.c
        pkcs15init/pkcs15-cflex.c
        pkcs15init/pkcs15-entersafe.c
        pkcs15init/pkcs15-epass2003.c
        pkcs15init/pkcs15-gids.c
        pkcs15init/pkcs15-iasecc.c
        pkcs15init/pkcs15-isoApplet.c
        pkcs15init/pkcs15-lib.c
        pkcs15init/pkcs15-muscle.c
        pkcs15init/pkcs15-myeid.c
        pkcs15init/pkcs15-oberthur-awp.c
        pkcs15init/pkcs15-oberthur.c
        pkcs15init/pkcs15-openpgp.c
        pkcs15init/pkcs15-rtecp.c
        pkcs15init/pkcs15-rutoken.c
        pkcs15init/pkcs15-sc-hsm.c
        pkcs15init/pkcs15-setcos.c
        pkcs15init/pkcs15-starcos.c
        pkcs15init/profile.c
        pkcs15init/pkcs15-iasecc.h
        pkcs15init/pkcs15-init.h
        pkcs15init/pkcs15-oberthur.h
        pkcs15init/profile.h

        sm/sm-common.h
        sm/sm-eac.h
        sm/sm-iso-internal.h
        sm/sm-iso.h
        sm/sm-common.c
        sm/sm-eac.c
        sm/sm-iso.c

        libopensc/apdu.c
        libopensc/asn1.c
        libopensc/aux-data.c
        libopensc/base64.c
        libopensc/card-asepcos.c
        libopensc/card-atrust-acos.c
        libopensc/card-authentic.c
        libopensc/card-belpic.c
        libopensc/card-cac-common.c
        libopensc/card-cac.c
        libopensc/card-cac1.c
        libopensc/card-cardos.c
        libopensc/card-coolkey.c
        libopensc/card-default.c
        libopensc/card-dnie.c
        libopensc/card-dtrust.c
        libopensc/card-edo.c
        libopensc/card-entersafe.c
        libopensc/card-eoi.c
        libopensc/card-epass2003.c
        libopensc/card-esteid2018.c
        libopensc/card-flex.c
        libopensc/card-gemsafeV1.c
        libopensc/card-gids.c
        libopensc/card-iasecc.c
        libopensc/card-idprime.c
        libopensc/card-isoApplet.c
        libopensc/card-itacns.c
        libopensc/card-jpki.c
        libopensc/card-masktech.c
        libopensc/card-mcrd.c
        libopensc/card-muscle.c
        libopensc/card-myeid.c
        libopensc/card-npa.c
        libopensc/card-nqApplet.c
        libopensc/card-oberthur.c
        libopensc/card-openpgp.c
        libopensc/card-piv.c
        libopensc/card-rtecp.c
        libopensc/card-rutoken.c
        libopensc/card-sc-hsm.c
        libopensc/card-setcos.c
        libopensc/card-skeid.c
        libopensc/card-starcos.c

        libopensc/card-tcos.c
        libopensc/card.c
        libopensc/compression.c
        libopensc/ctbcs.c
        libopensc/ctx.c
        libopensc/internal.h
        libopensc/reader-pcsc.c
        libopensc/cwa-dnie.c
        libopensc/cwa14890.c
        libopensc/dir.c
        libopensc/ef-atr.c
        libopensc/ef-gdo.c
        libopensc/errors.c
        libopensc/gp.c
        libopensc/iasecc-sdo.c
        libopensc/iasecc-sm.c
        libopensc/iso7816.c
        libopensc/log.c
        libopensc/muscle-filesystem.c
        libopensc/muscle.c
        libopensc/padding.c
        libopensc/pkcs15-actalis.c
        libopensc/pkcs15-algo.c
        libopensc/pkcs15-atrust-acos.c
        libopensc/pkcs15-cac.c
        libopensc/pkcs15-cache.c
        libopensc/pkcs15-cardos.c
        libopensc/pkcs15-cert.c
        libopensc/pkcs15-coolkey.c
        libopensc/pkcs15-data.c
        libopensc/pkcs15-din-66291.c
        libopensc/pkcs15-dnie.c
        libopensc/pkcs15-emulator-filter.c
        libopensc/pkcs15-eoi.c
        libopensc/pkcs15-esinit.c
        libopensc/pkcs15-esteid2018.c
        libopensc/pkcs15-gemsafeV1.c
        libopensc/pkcs15-gids.c
        libopensc/pkcs15-iasecc.c
        libopensc/pkcs15-idprime.c
        libopensc/pkcs15-itacns.c
        libopensc/pkcs15-jpki.c
        libopensc/pkcs15-nqApplet.c
        libopensc/pkcs15-oberthur.c
        libopensc/pkcs15-openpgp.c
        libopensc/pkcs15-pin.c
        libopensc/pkcs15-piv.c
        libopensc/pkcs15-prkey.c
        libopensc/pkcs15-pteid.c
        libopensc/pkcs15-pubkey.c
        libopensc/pkcs15-sc-hsm.c
        libopensc/pkcs15-sec.c
        libopensc/pkcs15-skeid.c
        libopensc/pkcs15-skey.c
        libopensc/pkcs15-starcert.c
        libopensc/pkcs15-starcos-esign.c
        libopensc/pkcs15-syn.c
        libopensc/pkcs15-tccardos.c
        libopensc/pkcs15-tcos.c
        libopensc/pkcs15.c
        libopensc/reader-ctapi.c
        libopensc/reader-openct.c

        libopensc/sc.c
        libopensc/sec.c
        libopensc/simpletlv.c
        libopensc/sm.c
        libopensc/asn1.h
        libopensc/authentic.h
        libopensc/aux-data.h
        libopensc/card-cac-common.h
        libopensc/card-eoi.h
        libopensc/card-gids.h
        libopensc/card-npa.h
        libopensc/card-openpgp.h
        libopensc/card-sc-hsm.h
        libopensc/cardctl.h
        libopensc/cards.h
        libopensc/ccid-types.h
        libopensc/compression.h
        libopensc/ctbcs.h
        libopensc/cwa-dnie.h
        libopensc/cwa14890.h
        libopensc/errors.h
        libopensc/gp.h
        libopensc/iasecc-sdo.h
        libopensc/iasecc.h
        libopensc/internal-winscard.h
        libopensc/iso7816.h
        libopensc/itacns.h
        libopensc/jpki.h
        libopensc/log.h
        libopensc/muscle-filesystem.h
        libopensc/muscle.h
        libopensc/opensc.h
        libopensc/pace.h
        libopensc/pkcs15-emulator-filter.h
        libopensc/pkcs15-syn.h
        libopensc/pkcs15.h
        libopensc/sc-ossl-compat.h
        libopensc/simpletlv.h
        libopensc/sm.h
        libopensc/types.h

        pkcs11/pkcs11-global.c
        pkcs11/pkcs11-session.c
        pkcs11/pkcs11-object.c
        pkcs11/misc.c
        pkcs11/slot.c
        pkcs11/mechanism.c
        pkcs11/openssl.c
        pkcs11/framework-pkcs15.c
        pkcs11/framework-pkcs15init.c
        pkcs11/debug.c
        pkcs11/pkcs11.exports
        pkcs11/pkcs11-display.c

        pkcs11/pkcs11-display.h

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


