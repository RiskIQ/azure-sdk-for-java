// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.microsoft.azure.storage.blob;

/**
 * Options for configuring the {@link TelemetryFactory}. Please refer to the Factory for more information.
 */
public final class TelemetryOptions {

    public static final TelemetryOptions DEFAULT = new TelemetryOptions(Constants.EMPTY_STRING);

    private final String userAgentPrefix;

    /**
     * @param userAgentPrefix
     *         A string prepended to each request's User-Agent and sent to the service. The service records.
     *         the user-agent in logs for diagnostics and tracking of client requests.
     */
    public TelemetryOptions(String userAgentPrefix) {
        this.userAgentPrefix = userAgentPrefix;
    }

    /**
     * @return The user agent prefix.
     */
    public String userAgentPrefix() {
        return this.userAgentPrefix;
    }
}
