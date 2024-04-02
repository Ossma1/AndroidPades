/*
 * Generated by util/mkerr.pl DO NOT EDIT
 * Copyright 1995-2024 The OpenSSL Project Authors. All Rights Reserved.
 *
 * Licensed under the Apache License 2.0 (the "License").  You may not use
 * this file except in compliance with the License.  You can obtain a copy
 * in the file LICENSE in the source distribution or at
 * https://www.openssl.org/source/license.html
 */

#ifndef OPENSSL_SSLERR_H
# define OPENSSL_SSLERR_H
# pragma once

# include "openssl/opensslconf.h"
# include "openssl/symhacks.h"
# include <openssl/sslerr_legacy.h>



/*
 * SSL reason codes.
 */
# define SSL_R_APPLICATION_DATA_AFTER_CLOSE_NOTIFY        291
# define SSL_R_APP_DATA_IN_HANDSHAKE                      100
# define SSL_R_ATTEMPT_TO_REUSE_SESSION_IN_DIFFERENT_CONTEXT 272
# define SSL_R_AT_LEAST_TLS_1_2_NEEDED_IN_SUITEB_MODE     158
# define SSL_R_BAD_CERTIFICATE                            348
# define SSL_R_BAD_CHANGE_CIPHER_SPEC                     103
# define SSL_R_BAD_CIPHER                                 186
# define SSL_R_BAD_COMPRESSION_ALGORITHM                  326
# define SSL_R_BAD_DATA                                   390
# define SSL_R_BAD_DATA_RETURNED_BY_CALLBACK              106
# define SSL_R_BAD_DECOMPRESSION                          107
# define SSL_R_BAD_DH_VALUE                               102
# define SSL_R_BAD_DIGEST_LENGTH                          111
# define SSL_R_BAD_EARLY_DATA                             233
# define SSL_R_BAD_ECC_CERT                               304
# define SSL_R_BAD_ECPOINT                                306
# define SSL_R_BAD_EXTENSION                              110
# define SSL_R_BAD_HANDSHAKE_LENGTH                       332
# define SSL_R_BAD_HANDSHAKE_STATE                        236
# define SSL_R_BAD_HELLO_REQUEST                          105
# define SSL_R_BAD_HRR_VERSION                            263
# define SSL_R_BAD_KEY_SHARE                              108
# define SSL_R_BAD_KEY_UPDATE                             122
# define SSL_R_BAD_LEGACY_VERSION                         292
# define SSL_R_BAD_LENGTH                                 271
# define SSL_R_BAD_PACKET                                 240
# define SSL_R_BAD_PACKET_LENGTH                          115
# define SSL_R_BAD_PROTOCOL_VERSION_NUMBER                116
# define SSL_R_BAD_PSK                                    219
# define SSL_R_BAD_PSK_IDENTITY                           114
# define SSL_R_BAD_RECORD_TYPE                            443
# define SSL_R_BAD_RSA_ENCRYPT                            119
# define SSL_R_BAD_SIGNATURE                              123
# define SSL_R_BAD_SRP_A_LENGTH                           347
# define SSL_R_BAD_SRP_PARAMETERS                         371
# define SSL_R_BAD_SRTP_MKI_VALUE                         352
# define SSL_R_BAD_SRTP_PROTECTION_PROFILE_LIST           353
# define SSL_R_BAD_SSL_FILETYPE                           124
# define SSL_R_BAD_VALUE                                  384
# define SSL_R_BAD_WRITE_RETRY                            127
# define SSL_R_BINDER_DOES_NOT_VERIFY                     253
# define SSL_R_BIO_NOT_SET                                128
# define SSL_R_BLOCK_CIPHER_PAD_IS_WRONG                  129
# define SSL_R_BN_LIB                                     130
# define SSL_R_CALLBACK_FAILED                            234
# define SSL_R_CANNOT_CHANGE_CIPHER                       109
# define SSL_R_CANNOT_GET_GROUP_NAME                      299
# define SSL_R_CA_DN_LENGTH_MISMATCH                      131
# define SSL_R_CA_KEY_TOO_SMALL                           397
# define SSL_R_CA_MD_TOO_WEAK                             398
# define SSL_R_CCS_RECEIVED_EARLY                         133
# define SSL_R_CERTIFICATE_VERIFY_FAILED                  134
# define SSL_R_CERT_CB_ERROR                              377
# define SSL_R_CERT_LENGTH_MISMATCH                       135
# define SSL_R_CIPHERSUITE_DIGEST_HAS_CHANGED             218
# define SSL_R_CIPHER_CODE_WRONG_LENGTH                   137
# define SSL_R_CLIENTHELLO_TLSEXT                         226
# define SSL_R_COMPRESSED_LENGTH_TOO_LONG                 140
# define SSL_R_COMPRESSION_DISABLED                       343
# define SSL_R_COMPRESSION_FAILURE                        141
# define SSL_R_COMPRESSION_ID_NOT_WITHIN_PRIVATE_RANGE    307
# define SSL_R_COMPRESSION_LIBRARY_ERROR                  142
# define SSL_R_CONNECTION_TYPE_NOT_SET                    144
# define SSL_R_CONN_USE_ONLY                              356
# define SSL_R_CONTEXT_NOT_DANE_ENABLED                   167
# define SSL_R_COOKIE_GEN_CALLBACK_FAILURE                400
# define SSL_R_COOKIE_MISMATCH                            308
# define SSL_R_COPY_PARAMETERS_FAILED                     296
# define SSL_R_CUSTOM_EXT_HANDLER_ALREADY_INSTALLED       206
# define SSL_R_DANE_ALREADY_ENABLED                       172
# define SSL_R_DANE_CANNOT_OVERRIDE_MTYPE_FULL            173
# define SSL_R_DANE_NOT_ENABLED                           175
# define SSL_R_DANE_TLSA_BAD_CERTIFICATE                  180
# define SSL_R_DANE_TLSA_BAD_CERTIFICATE_USAGE            184
# define SSL_R_DANE_TLSA_BAD_DATA_LENGTH                  189
# define SSL_R_DANE_TLSA_BAD_DIGEST_LENGTH                192
# define SSL_R_DANE_TLSA_BAD_MATCHING_TYPE                200
# define SSL_R_DANE_TLSA_BAD_PUBLIC_KEY                   201
# define SSL_R_DANE_TLSA_BAD_SELECTOR                     202
# define SSL_R_DANE_TLSA_NULL_DATA                        203
# define SSL_R_DATA_BETWEEN_CCS_AND_FINISHED              145
# define SSL_R_DATA_LENGTH_TOO_LONG                       146
# define SSL_R_DECRYPTION_FAILED                          147
# define SSL_R_DECRYPTION_FAILED_OR_BAD_RECORD_MAC        281
# define SSL_R_DH_KEY_TOO_SMALL                           394
# define SSL_R_DH_PUBLIC_VALUE_LENGTH_IS_WRONG            148
# define SSL_R_DIGEST_CHECK_FAILED                        149
# define SSL_R_DTLS_MESSAGE_TOO_BIG                       334
# define SSL_R_DUPLICATE_COMPRESSION_ID                   309
# define SSL_R_ECC_CERT_NOT_FOR_SIGNING                   318
# define SSL_R_ECDH_REQUIRED_FOR_SUITEB_MODE              374
# define SSL_R_EE_KEY_TOO_SMALL                           399
# define SSL_R_EMPTY_RAW_PUBLIC_KEY                       349
# define SSL_R_EMPTY_SRTP_PROTECTION_PROFILE_LIST         354
# define SSL_R_ENCRYPTED_LENGTH_TOO_LONG                  150
# define SSL_R_ERROR_IN_RECEIVED_CIPHER_LIST              151
# define SSL_R_ERROR_SETTING_TLSA_BASE_DOMAIN             204
# define SSL_R_EXCEEDS_MAX_FRAGMENT_SIZE                  194
# define SSL_R_EXCESSIVE_MESSAGE_SIZE                     152
# define SSL_R_EXTENSION_NOT_RECEIVED                     279
# define SSL_R_EXTRA_DATA_IN_MESSAGE                      153
# define SSL_R_EXT_LENGTH_MISMATCH                        163
# define SSL_R_FAILED_TO_GET_PARAMETER                    316
# define SSL_R_FAILED_TO_INIT_ASYNC                       405
# define SSL_R_FEATURE_NEGOTIATION_NOT_COMPLETE           417
# define SSL_R_FEATURE_NOT_RENEGOTIABLE                   413
# define SSL_R_FRAGMENTED_CLIENT_HELLO                    401
# define SSL_R_GOT_A_FIN_BEFORE_A_CCS                     154
# define SSL_R_HTTPS_PROXY_REQUEST                        155
# define SSL_R_HTTP_REQUEST                               156
# define SSL_R_ILLEGAL_POINT_COMPRESSION                  162
# define SSL_R_ILLEGAL_SUITEB_DIGEST                      380
# define SSL_R_INAPPROPRIATE_FALLBACK                     373
# define SSL_R_INCONSISTENT_COMPRESSION                   340
# define SSL_R_INCONSISTENT_EARLY_DATA_ALPN               222
# define SSL_R_INCONSISTENT_EARLY_DATA_SNI                231
# define SSL_R_INCONSISTENT_EXTMS                         104
# define SSL_R_INSUFFICIENT_SECURITY                      241
# define SSL_R_INVALID_ALERT                              205
# define SSL_R_INVALID_CCS_MESSAGE                        260
# define SSL_R_INVALID_CERTIFICATE_OR_ALG                 238
# define SSL_R_INVALID_COMMAND                            280
# define SSL_R_INVALID_COMPRESSION_ALGORITHM              341
# define SSL_R_INVALID_CONFIG                             283
# define SSL_R_INVALID_CONFIGURATION_NAME                 113
# define SSL_R_INVALID_CONTEXT                            282
# define SSL_R_INVALID_CT_VALIDATION_TYPE                 212
# define SSL_R_INVALID_KEY_UPDATE_TYPE                    120
# define SSL_R_INVALID_MAX_EARLY_DATA                     174
# define SSL_R_INVALID_NULL_CMD_NAME                      385
# define SSL_R_INVALID_RAW_PUBLIC_KEY                     350
# define SSL_R_INVALID_RECORD                             317
# define SSL_R_INVALID_SEQUENCE_NUMBER                    402
# define SSL_R_INVALID_SERVERINFO_DATA                    388
# define SSL_R_INVALID_SESSION_ID                         999
# define SSL_R_INVALID_SRP_USERNAME                       357
# define SSL_R_INVALID_STATUS_RESPONSE                    328
# define SSL_R_INVALID_TICKET_KEYS_LENGTH                 325
# define SSL_R_LEGACY_SIGALG_DISALLOWED_OR_UNSUPPORTED    333
# define SSL_R_LENGTH_MISMATCH                            159
# define SSL_R_LENGTH_TOO_LONG                            404
# define SSL_R_LENGTH_TOO_SHORT                           160
# define SSL_R_LIBRARY_BUG                                274
# define SSL_R_LIBRARY_HAS_NO_CIPHERS                     161
# define SSL_R_MAXIMUM_ENCRYPTED_PKTS_REACHED             395
# define SSL_R_MISSING_DSA_SIGNING_CERT                   165
# define SSL_R_MISSING_ECDSA_SIGNING_CERT                 381
# define SSL_R_MISSING_FATAL                              256
# define SSL_R_MISSING_PARAMETERS                         290
# define SSL_R_MISSING_PSK_KEX_MODES_EXTENSION            310
# define SSL_R_MISSING_RSA_CERTIFICATE                    168
# define SSL_R_MISSING_RSA_ENCRYPTING_CERT                169
# define SSL_R_MISSING_RSA_SIGNING_CERT                   170
# define SSL_R_MISSING_SIGALGS_EXTENSION                  112
# define SSL_R_MISSING_SIGNING_CERT                       221
# define SSL_R_MISSING_SRP_PARAM                          358
# define SSL_R_MISSING_SUPPORTED_GROUPS_EXTENSION         209
# define SSL_R_MISSING_TMP_DH_KEY                         171
# define SSL_R_MISSING_TMP_ECDH_KEY                       311
# define SSL_R_MIXED_HANDSHAKE_AND_NON_HANDSHAKE_DATA     293
# define SSL_R_NOT_ON_RECORD_BOUNDARY                     182
# define SSL_R_NOT_REPLACING_CERTIFICATE                  289
# define SSL_R_NOT_SERVER                                 284
# define SSL_R_NO_APPLICATION_PROTOCOL                    235
# define SSL_R_NO_CERTIFICATES_RETURNED                   176
# define SSL_R_NO_CERTIFICATE_ASSIGNED                    177
# define SSL_R_NO_CERTIFICATE_SET                         179
# define SSL_R_NO_CHANGE_FOLLOWING_HRR                    214
# define SSL_R_NO_CIPHERS_AVAILABLE                       181
# define SSL_R_NO_CIPHERS_SPECIFIED                       183
# define SSL_R_NO_CIPHER_MATCH                            185
# define SSL_R_NO_CLIENT_CERT_METHOD                      331
# define SSL_R_NO_COMPRESSION_SPECIFIED                   187
# define SSL_R_NO_COOKIE_CALLBACK_SET                     287
# define SSL_R_NO_GOST_CERTIFICATE_SENT_BY_PEER           330
# define SSL_R_NO_METHOD_SPECIFIED                        188
# define SSL_R_NO_PEM_EXTENSIONS                          389
# define SSL_R_NO_PRIVATE_KEY_ASSIGNED                    190
# define SSL_R_NO_PROTOCOLS_AVAILABLE                     191
# define SSL_R_NO_RENEGOTIATION                           339
# define SSL_R_NO_REQUIRED_DIGEST                         324
# define SSL_R_NO_SHARED_CIPHER                           193
# define SSL_R_NO_SHARED_GROUPS                           410
# define SSL_R_NO_SHARED_SIGNATURE_ALGORITHMS             376
# define SSL_R_NO_SRTP_PROFILES                           359
# define SSL_R_NO_STREAM                                  355
# define SSL_R_NO_SUITABLE_DIGEST_ALGORITHM               297
# define SSL_R_NO_SUITABLE_GROUPS                         295
# define SSL_R_NO_SUITABLE_KEY_SHARE                      101
# define SSL_R_NO_SUITABLE_RECORD_LAYER                   322
# define SSL_R_NO_SUITABLE_SIGNATURE_ALGORITHM            118
# define SSL_R_NO_VALID_SCTS                              216
# define SSL_R_NO_VERIFY_COOKIE_CALLBACK                  403
# define SSL_R_NULL_SSL_CTX                               195
# define SSL_R_NULL_SSL_METHOD_PASSED                     196
# define SSL_R_OCSP_CALLBACK_FAILURE                      305
# define SSL_R_OLD_SESSION_CIPHER_NOT_RETURNED            197
# define SSL_R_OLD_SESSION_COMPRESSION_ALGORITHM_NOT_RETURNED 344
# define SSL_R_OVERFLOW_ERROR                             237
# define SSL_R_PACKET_LENGTH_TOO_LONG                     198
# define SSL_R_PARSE_TLSEXT                               227
# define SSL_R_PATH_TOO_LONG                              270
# define SSL_R_PEER_DID_NOT_RETURN_A_CERTIFICATE          199
# define SSL_R_PEM_NAME_BAD_PREFIX                        391
# define SSL_R_PEM_NAME_TOO_SHORT                         392
# define SSL_R_PIPELINE_FAILURE                           406
# define SSL_R_POLL_REQUEST_NOT_SUPPORTED                 418
# define SSL_R_POST_HANDSHAKE_AUTH_ENCODING_ERR           278
# define SSL_R_PRIVATE_KEY_MISMATCH                       288
# define SSL_R_PROTOCOL_IS_SHUTDOWN                       207
# define SSL_R_PSK_IDENTITY_NOT_FOUND                     223
# define SSL_R_PSK_NO_CLIENT_CB                           224
# define SSL_R_PSK_NO_SERVER_CB                           225
# define SSL_R_QUIC_HANDSHAKE_LAYER_ERROR                 393
# define SSL_R_QUIC_NETWORK_ERROR                         387
# define SSL_R_QUIC_PROTOCOL_ERROR                        382
# define SSL_R_READ_BIO_NOT_SET                           211
# define SSL_R_READ_TIMEOUT_EXPIRED                       312
# define SSL_R_RECORDS_NOT_RELEASED                       321
# define SSL_R_RECORD_LAYER_FAILURE                       313
# define SSL_R_RECORD_LENGTH_MISMATCH                     213
# define SSL_R_RECORD_TOO_SMALL                           298
# define SSL_R_REMOTE_PEER_ADDRESS_NOT_SET                346
# define SSL_R_RENEGOTIATE_EXT_TOO_LONG                   335
# define SSL_R_RENEGOTIATION_ENCODING_ERR                 336
# define SSL_R_RENEGOTIATION_MISMATCH                     337
# define SSL_R_REQUEST_PENDING                            285
# define SSL_R_REQUEST_SENT                               286
# define SSL_R_REQUIRED_CIPHER_MISSING                    215
# define SSL_R_REQUIRED_COMPRESSION_ALGORITHM_MISSING     342
# define SSL_R_SCSV_RECEIVED_WHEN_RENEGOTIATING           345
# define SSL_R_SCT_VERIFICATION_FAILED                    208
# define SSL_R_SEQUENCE_CTR_WRAPPED                       327
# define SSL_R_SERVERHELLO_TLSEXT                         275
# define SSL_R_SESSION_ID_CONTEXT_UNINITIALIZED           277
# define SSL_R_SHUTDOWN_WHILE_IN_INIT                     407
# define SSL_R_SIGNATURE_ALGORITHMS_ERROR                 360
# define SSL_R_SIGNATURE_FOR_NON_SIGNING_CERTIFICATE      220
# define SSL_R_SRP_A_CALC                                 361
# define SSL_R_SRTP_COULD_NOT_ALLOCATE_PROFILES           362
# define SSL_R_SRTP_PROTECTION_PROFILE_LIST_TOO_LONG      363
# define SSL_R_SRTP_UNKNOWN_PROTECTION_PROFILE            364
# define SSL_R_SSL3_EXT_INVALID_MAX_FRAGMENT_LENGTH       232
# define SSL_R_SSL3_EXT_INVALID_SERVERNAME                319
# define SSL_R_SSL3_EXT_INVALID_SERVERNAME_TYPE           320
# define SSL_R_SSL3_SESSION_ID_TOO_LONG                   300
# define SSL_R_SSLV3_ALERT_BAD_CERTIFICATE                1042
# define SSL_R_SSLV3_ALERT_BAD_RECORD_MAC                 1020
# define SSL_R_SSLV3_ALERT_CERTIFICATE_EXPIRED            1045
# define SSL_R_SSLV3_ALERT_CERTIFICATE_REVOKED            1044
# define SSL_R_SSLV3_ALERT_CERTIFICATE_UNKNOWN            1046
# define SSL_R_SSLV3_ALERT_DECOMPRESSION_FAILURE          1030
# define SSL_R_SSLV3_ALERT_HANDSHAKE_FAILURE              1040
# define SSL_R_SSLV3_ALERT_ILLEGAL_PARAMETER              1047
# define SSL_R_SSLV3_ALERT_NO_CERTIFICATE                 1041
# define SSL_R_SSLV3_ALERT_UNEXPECTED_MESSAGE             1010
# define SSL_R_SSLV3_ALERT_UNSUPPORTED_CERTIFICATE        1043
# define SSL_R_SSL_COMMAND_SECTION_EMPTY                  117
# define SSL_R_SSL_COMMAND_SECTION_NOT_FOUND              125
# define SSL_R_SSL_CTX_HAS_NO_DEFAULT_SSL_VERSION         228
# define SSL_R_SSL_HANDSHAKE_FAILURE                      229
# define SSL_R_SSL_LIBRARY_HAS_NO_CIPHERS                 230
# define SSL_R_SSL_NEGATIVE_LENGTH                        372
# define SSL_R_SSL_SECTION_EMPTY                          126
# define SSL_R_SSL_SECTION_NOT_FOUND                      136
# define SSL_R_SSL_SESSION_ID_CALLBACK_FAILED             301
# define SSL_R_SSL_SESSION_ID_CONFLICT                    302
# define SSL_R_SSL_SESSION_ID_CONTEXT_TOO_LONG            273
# define SSL_R_SSL_SESSION_ID_HAS_BAD_LENGTH              303
# define SSL_R_SSL_SESSION_ID_TOO_LONG                    408
# define SSL_R_SSL_SESSION_VERSION_MISMATCH               210
# define SSL_R_STILL_IN_INIT                              121
# define SSL_R_STREAM_COUNT_LIMITED                       411
# define SSL_R_STREAM_FINISHED                            365
# define SSL_R_STREAM_RECV_ONLY                           366
# define SSL_R_STREAM_RESET                               375
# define SSL_R_STREAM_SEND_ONLY                           379
# define SSL_R_TLSV13_ALERT_CERTIFICATE_REQUIRED          1116
# define SSL_R_TLSV13_ALERT_MISSING_EXTENSION             1109
# define SSL_R_TLSV1_ALERT_ACCESS_DENIED                  1049
# define SSL_R_TLSV1_ALERT_DECODE_ERROR                   1050
# define SSL_R_TLSV1_ALERT_DECRYPTION_FAILED              1021
# define SSL_R_TLSV1_ALERT_DECRYPT_ERROR                  1051
# define SSL_R_TLSV1_ALERT_EXPORT_RESTRICTION             1060
# define SSL_R_TLSV1_ALERT_INAPPROPRIATE_FALLBACK         1086
# define SSL_R_TLSV1_ALERT_INSUFFICIENT_SECURITY          1071
# define SSL_R_TLSV1_ALERT_INTERNAL_ERROR                 1080
# define SSL_R_TLSV1_ALERT_NO_RENEGOTIATION               1100
# define SSL_R_TLSV1_ALERT_PROTOCOL_VERSION               1070
# define SSL_R_TLSV1_ALERT_RECORD_OVERFLOW                1022
# define SSL_R_TLSV1_ALERT_UNKNOWN_CA                     1048
# define SSL_R_TLSV1_ALERT_USER_CANCELLED                 1090
# define SSL_R_TLSV1_BAD_CERTIFICATE_HASH_VALUE           1114
# define SSL_R_TLSV1_BAD_CERTIFICATE_STATUS_RESPONSE      1113
# define SSL_R_TLSV1_CERTIFICATE_UNOBTAINABLE             1111
# define SSL_R_TLSV1_UNRECOGNIZED_NAME                    1112
# define SSL_R_TLSV1_UNSUPPORTED_EXTENSION                1110
# define SSL_R_TLS_ILLEGAL_EXPORTER_LABEL                 367
# define SSL_R_TLS_INVALID_ECPOINTFORMAT_LIST             157
# define SSL_R_TOO_MANY_KEY_UPDATES                       132
# define SSL_R_TOO_MANY_WARN_ALERTS                       409
# define SSL_R_TOO_MUCH_EARLY_DATA                        164
# define SSL_R_UNABLE_TO_FIND_ECDH_PARAMETERS             314
# define SSL_R_UNABLE_TO_FIND_PUBLIC_KEY_PARAMETERS       239
# define SSL_R_UNABLE_TO_LOAD_SSL3_MD5_ROUTINES           242
# define SSL_R_UNABLE_TO_LOAD_SSL3_SHA1_ROUTINES          243
# define SSL_R_UNEXPECTED_CCS_MESSAGE                     262
# define SSL_R_UNEXPECTED_END_OF_EARLY_DATA               178
# define SSL_R_UNEXPECTED_EOF_WHILE_READING               294
# define SSL_R_UNEXPECTED_MESSAGE                         244
# define SSL_R_UNEXPECTED_RECORD                          245
# define SSL_R_UNINITIALIZED                              276
# define SSL_R_UNKNOWN_ALERT_TYPE                         246
# define SSL_R_UNKNOWN_CERTIFICATE_TYPE                   247
# define SSL_R_UNKNOWN_CIPHER_RETURNED                    248
# define SSL_R_UNKNOWN_CIPHER_TYPE                        249
# define SSL_R_UNKNOWN_CMD_NAME                           386
# define SSL_R_UNKNOWN_COMMAND                            139
# define SSL_R_UNKNOWN_DIGEST                             368
# define SSL_R_UNKNOWN_KEY_EXCHANGE_TYPE                  250
# define SSL_R_UNKNOWN_MANDATORY_PARAMETER                323
# define SSL_R_UNKNOWN_PKEY_TYPE                          251
# define SSL_R_UNKNOWN_PROTOCOL                           252
# define SSL_R_UNKNOWN_SSL_VERSION                        254
# define SSL_R_UNKNOWN_STATE                              255
# define SSL_R_UNSAFE_LEGACY_RENEGOTIATION_DISABLED       338
# define SSL_R_UNSOLICITED_EXTENSION                      217
# define SSL_R_UNSUPPORTED_COMPRESSION_ALGORITHM          257
# define SSL_R_UNSUPPORTED_CONFIG_VALUE                   414
# define SSL_R_UNSUPPORTED_CONFIG_VALUE_CLASS             415
# define SSL_R_UNSUPPORTED_CONFIG_VALUE_OP                416
# define SSL_R_UNSUPPORTED_ELLIPTIC_CURVE                 315
# define SSL_R_UNSUPPORTED_PROTOCOL                       258
# define SSL_R_UNSUPPORTED_SSL_VERSION                    259
# define SSL_R_UNSUPPORTED_STATUS_TYPE                    329
# define SSL_R_UNSUPPORTED_WRITE_FLAG                     412
# define SSL_R_USE_SRTP_NOT_NEGOTIATED                    369
# define SSL_R_VERSION_TOO_HIGH                           166
# define SSL_R_VERSION_TOO_LOW                            396
# define SSL_R_WRONG_CERTIFICATE_TYPE                     383
# define SSL_R_WRONG_CIPHER_RETURNED                      261
# define SSL_R_WRONG_CURVE                                378
# define SSL_R_WRONG_RPK_TYPE                             351
# define SSL_R_WRONG_SIGNATURE_LENGTH                     264
# define SSL_R_WRONG_SIGNATURE_SIZE                       265
# define SSL_R_WRONG_SIGNATURE_TYPE                       370
# define SSL_R_WRONG_SSL_VERSION                          266
# define SSL_R_WRONG_VERSION_NUMBER                       267
# define SSL_R_X509_LIB                                   268
# define SSL_R_X509_VERIFICATION_SETUP_PROBLEMS           269

#endif
