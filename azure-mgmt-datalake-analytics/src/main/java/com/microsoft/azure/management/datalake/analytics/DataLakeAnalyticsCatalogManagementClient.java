/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.analytics;

import com.microsoft.azure.AzureClient;
import com.microsoft.rest.RestClient;

/**
 * The interface for DataLakeAnalyticsCatalogManagementClient class.
 */
public interface DataLakeAnalyticsCatalogManagementClient {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    AzureClient getAzureClient();

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    String userAgent();

    /**
     * Gets Client Api Version..
     *
     * @return the apiVersion value.
     */
    String apiVersion();

    /**
     * Gets Gets the DNS suffix used as the base for all Azure Data Lake Analytics Catalog service requests..
     *
     * @return the adlaCatalogDnsSuffix value.
     */
    String adlaCatalogDnsSuffix();

    /**
     * Sets Gets the DNS suffix used as the base for all Azure Data Lake Analytics Catalog service requests..
     *
     * @param adlaCatalogDnsSuffix the adlaCatalogDnsSuffix value.
     * @return the service client itself
     */
    DataLakeAnalyticsCatalogManagementClient withAdlaCatalogDnsSuffix(String adlaCatalogDnsSuffix);

    /**
     * Gets Gets or sets the preferred language for the response..
     *
     * @return the acceptLanguage value.
     */
    String acceptLanguage();

    /**
     * Sets Gets or sets the preferred language for the response..
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    DataLakeAnalyticsCatalogManagementClient withAcceptLanguage(String acceptLanguage);

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    int longRunningOperationRetryTimeout();

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    DataLakeAnalyticsCatalogManagementClient withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout);

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @return the generateClientRequestId value.
     */
    boolean generateClientRequestId();

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    DataLakeAnalyticsCatalogManagementClient withGenerateClientRequestId(boolean generateClientRequestId);

    /**
     * Gets the Catalogs object to access its operations.
     * @return the Catalogs object.
     */
    Catalogs catalogs();

}
