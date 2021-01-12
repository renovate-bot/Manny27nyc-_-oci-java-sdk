/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing.internal;

/**
 * An enum for KeyId types and associated patterns
 */
public enum KeyIdType {

    /**
     * KeyId that is generated by Identity provisioning service after user uploads a public key. It has the format:
     * {tenantId/userId/fingerprint}, where tenantId and userId are GUIDs and fingerprint is a lower-cased MD5 separated
     * by ':' for every two hexadecimal characters. TODO: relaxed tenantId and userId format for now so it allows guid,
     * number id and name currently supports ocidV1 and ocidV2
     * ocidv1:tenancy:dev:sea:aaaaaaaaFA587D08AEF745488C5D276E14F46808/ocidv1:user:dev:sea:aaaaaaaa3F051B5A1B3D46968902530E2F33163F/36:af:36:16:2a:c4:06:44:3b:56:3c:e1:27:c5:52:62
     * ocid1.tenancy.dev..aaaaaaaaFA587D08AEF745488C5D276E14F46808/ocid1.user.dev..aaaaaaaa3F051B5A1B3D46968902530E2F33163F/36:af:36:16:2a:c4:06:44:3b:56:3c:e1:27:c5:52:62
     */
    REF(
            "^(([0-9a-zA-Z-_]{1,}[.:]){1}([0-9a-zA-Z-_]{0,}[.:]){3,}([0-9a-zA-Z-_]{1,})/){2}([0-9a-f]{2}:){15}[0-9a-f]{2}$");

    private final String pattern;

    KeyIdType(final String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }
}
