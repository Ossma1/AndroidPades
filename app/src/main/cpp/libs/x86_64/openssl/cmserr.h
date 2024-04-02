/*
 * Generated by util/mkerr.pl DO NOT EDIT
 * Copyright 1995-2023 The OpenSSL Project Authors. All Rights Reserved.
 *
 * Licensed under the Apache License 2.0 (the "License").  You may not use
 * this file except in compliance with the License.  You can obtain a copy
 * in the file LICENSE in the source distribution or at
 * https://www.openssl.org/source/license.html
 */

#ifndef OPENSSL_CMSERR_H
# define OPENSSL_CMSERR_H
# pragma once

# include "openssl/opensslconf.h"
# include "openssl/symhacks.h"
# include <openssl/cryptoerr_legacy.h>


# ifndef OPENSSL_NO_CMS


/*
 * CMS reason codes.
 */
#  define CMS_R_ADD_SIGNER_ERROR                           99
#  define CMS_R_ATTRIBUTE_ERROR                            161
#  define CMS_R_CERTIFICATE_ALREADY_PRESENT                175
#  define CMS_R_CERTIFICATE_HAS_NO_KEYID                   160
#  define CMS_R_CERTIFICATE_VERIFY_ERROR                   100
#  define CMS_R_CIPHER_AEAD_SET_TAG_ERROR                  184
#  define CMS_R_CIPHER_GET_TAG                             185
#  define CMS_R_CIPHER_INITIALISATION_ERROR                101
#  define CMS_R_CIPHER_PARAMETER_INITIALISATION_ERROR      102
#  define CMS_R_CMS_DATAFINAL_ERROR                        103
#  define CMS_R_CMS_LIB                                    104
#  define CMS_R_CONTENTIDENTIFIER_MISMATCH                 170
#  define CMS_R_CONTENT_NOT_FOUND                          105
#  define CMS_R_CONTENT_TYPE_MISMATCH                      171
#  define CMS_R_CONTENT_TYPE_NOT_COMPRESSED_DATA           106
#  define CMS_R_CONTENT_TYPE_NOT_ENVELOPED_DATA            107
#  define CMS_R_CONTENT_TYPE_NOT_SIGNED_DATA               108
#  define CMS_R_CONTENT_VERIFY_ERROR                       109
#  define CMS_R_CTRL_ERROR                                 110
#  define CMS_R_CTRL_FAILURE                               111
#  define CMS_R_DECODE_ERROR                               187
#  define CMS_R_DECRYPT_ERROR                              112
#  define CMS_R_ERROR_GETTING_PUBLIC_KEY                   113
#  define CMS_R_ERROR_READING_MESSAGEDIGEST_ATTRIBUTE      114
#  define CMS_R_ERROR_SETTING_KEY                          115
#  define CMS_R_ERROR_SETTING_RECIPIENTINFO                116
#  define CMS_R_ESS_SIGNING_CERTID_MISMATCH_ERROR          183
#  define CMS_R_INVALID_ENCRYPTED_KEY_LENGTH               117
#  define CMS_R_INVALID_KEY_ENCRYPTION_PARAMETER           176
#  define CMS_R_INVALID_KEY_LENGTH                         118
#  define CMS_R_INVALID_LABEL                              190
#  define CMS_R_INVALID_OAEP_PARAMETERS                    191
#  define CMS_R_KDF_PARAMETER_ERROR                        186
#  define CMS_R_MD_BIO_INIT_ERROR                          119
#  define CMS_R_MESSAGEDIGEST_ATTRIBUTE_WRONG_LENGTH       120
#  define CMS_R_MESSAGEDIGEST_WRONG_LENGTH                 121
#  define CMS_R_MSGSIGDIGEST_ERROR                         172
#  define CMS_R_MSGSIGDIGEST_VERIFICATION_FAILURE          162
#  define CMS_R_MSGSIGDIGEST_WRONG_LENGTH                  163
#  define CMS_R_NEED_ONE_SIGNER                            164
#  define CMS_R_NOT_A_SIGNED_RECEIPT                       165
#  define CMS_R_NOT_ENCRYPTED_DATA                         122
#  define CMS_R_NOT_KEK                                    123
#  define CMS_R_NOT_KEY_AGREEMENT                          181
#  define CMS_R_NOT_KEY_TRANSPORT                          124
#  define CMS_R_NOT_PWRI                                   177
#  define CMS_R_NOT_SUPPORTED_FOR_THIS_KEY_TYPE            125
#  define CMS_R_NO_CIPHER                                  126
#  define CMS_R_NO_CONTENT                                 127
#  define CMS_R_NO_CONTENT_TYPE                            173
#  define CMS_R_NO_DEFAULT_DIGEST                          128
#  define CMS_R_NO_DIGEST_SET                              129
#  define CMS_R_NO_KEY                                     130
#  define CMS_R_NO_KEY_OR_CERT                             174
#  define CMS_R_NO_MATCHING_DIGEST                         131
#  define CMS_R_NO_MATCHING_RECIPIENT                      132
#  define CMS_R_NO_MATCHING_SIGNATURE                      166
#  define CMS_R_NO_MSGSIGDIGEST                            167
#  define CMS_R_NO_PASSWORD                                178
#  define CMS_R_NO_PRIVATE_KEY                             133
#  define CMS_R_NO_PUBLIC_KEY                              134
#  define CMS_R_NO_RECEIPT_REQUEST                         168
#  define CMS_R_NO_SIGNERS                                 135
#  define CMS_R_OPERATION_UNSUPPORTED                      182
#  define CMS_R_PEER_KEY_ERROR                             188
#  define CMS_R_PRIVATE_KEY_DOES_NOT_MATCH_CERTIFICATE     136
#  define CMS_R_RECEIPT_DECODE_ERROR                       169
#  define CMS_R_RECIPIENT_ERROR                            137
#  define CMS_R_SHARED_INFO_ERROR                          189
#  define CMS_R_SIGNER_CERTIFICATE_NOT_FOUND               138
#  define CMS_R_SIGNFINAL_ERROR                            139
#  define CMS_R_SMIME_TEXT_ERROR                           140
#  define CMS_R_STORE_INIT_ERROR                           141
#  define CMS_R_TYPE_NOT_COMPRESSED_DATA                   142
#  define CMS_R_TYPE_NOT_DATA                              143
#  define CMS_R_TYPE_NOT_DIGESTED_DATA                     144
#  define CMS_R_TYPE_NOT_ENCRYPTED_DATA                    145
#  define CMS_R_TYPE_NOT_ENVELOPED_DATA                    146
#  define CMS_R_UNABLE_TO_FINALIZE_CONTEXT                 147
#  define CMS_R_UNKNOWN_CIPHER                             148
#  define CMS_R_UNKNOWN_DIGEST_ALGORITHM                   149
#  define CMS_R_UNKNOWN_ID                                 150
#  define CMS_R_UNSUPPORTED_COMPRESSION_ALGORITHM          151
#  define CMS_R_UNSUPPORTED_CONTENT_ENCRYPTION_ALGORITHM   194
#  define CMS_R_UNSUPPORTED_CONTENT_TYPE                   152
#  define CMS_R_UNSUPPORTED_ENCRYPTION_TYPE                192
#  define CMS_R_UNSUPPORTED_KEK_ALGORITHM                  153
#  define CMS_R_UNSUPPORTED_KEY_ENCRYPTION_ALGORITHM       179
#  define CMS_R_UNSUPPORTED_LABEL_SOURCE                   193
#  define CMS_R_UNSUPPORTED_RECIPIENTINFO_TYPE             155
#  define CMS_R_UNSUPPORTED_RECIPIENT_TYPE                 154
#  define CMS_R_UNSUPPORTED_SIGNATURE_ALGORITHM            195
#  define CMS_R_UNSUPPORTED_TYPE                           156
#  define CMS_R_UNWRAP_ERROR                               157
#  define CMS_R_UNWRAP_FAILURE                             180
#  define CMS_R_VERIFICATION_FAILURE                       158
#  define CMS_R_WRAP_ERROR                                 159

# endif
#endif
