/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tokenhub.v20260322;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tokenhub.v20260322.models.*;

public class TokenhubClient extends AbstractClient{
    private static String endpoint = "tokenhub.intl.tencentcloudapi.com";
    private static String service = "tokenhub";
    private static String version = "2026-03-22";

    public TokenhubClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TokenhubClient(Credential credential, String region, ClientProfile profile) {
        super(TokenhubClient.endpoint, TokenhubClient.version, credential, region, profile);
    }

    /**
     *Create an API key.

Create a new API key. Upon successful creation, return the API Key ID. Specify the platform kind, binding method, and initial state.
     * @param req CreateApiKeyRequest
     * @return CreateApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateApiKeyResponse CreateApiKey(CreateApiKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApiKey", CreateApiKeyResponse.class);
    }

    /**
     *Create a Termbase.

Create a new Termbase in this application for custom definition source to target language terminology mapping. Return the Termbase ID upon success, which can be used to carry out other management operations on terminology entries.
     * @param req CreateGlossaryRequest
     * @return CreateGlossaryResponse
     * @throws TencentCloudSDKException
     */
    public CreateGlossaryResponse CreateGlossary(CreateGlossaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGlossary", CreateGlossaryResponse.class);
    }

    /**
     *Create terminology entries in batches.

Create terminology entries in batches under the designated Termbase. You can create up to 100 entries at a time.
     * @param req CreateGlossaryEntriesRequest
     * @return CreateGlossaryEntriesResponse
     * @throws TencentCloudSDKException
     */
    public CreateGlossaryEntriesResponse CreateGlossaryEntries(CreateGlossaryEntriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGlossaryEntries", CreateGlossaryEntriesResponse.class);
    }

    /**
     *Batch create TokenPlan API Keys.

Import a name prefix and quantity to automatically generate names in the `{Api Key Name}-{serial number}` format (for example, aaa-1, aaa-2). Duplicate names are allowed. Partial success is supported for up to 100 entries.
     * @param req CreateTokenPlanApiKeysRequest
     * @return CreateTokenPlanApiKeysResponse
     * @throws TencentCloudSDKException
     */
    public CreateTokenPlanApiKeysResponse CreateTokenPlanApiKeys(CreateTokenPlanApiKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTokenPlanApiKeys", CreateTokenPlanApiKeysResponse.class);
    }

    /**
     *Purchase a package (This API is also used to reactivate and renew expired packages. The teamId of the expired package is required. After the renewal is successful, the total cycle count of the package will include historical cycles. The actual effective cycle of the package is determined by the effective time and expiration time.)

Initiate an order for a TokenPlan package and complete payment. Return the order ID and associated sub-orders and resource information upon success.
     * @param req CreateTokenPlanTeamOrderAndBuyRequest
     * @return CreateTokenPlanTeamOrderAndBuyResponse
     * @throws TencentCloudSDKException
     */
    public CreateTokenPlanTeamOrderAndBuyResponse CreateTokenPlanTeamOrderAndBuy(CreateTokenPlanTeamOrderAndBuyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTokenPlanTeamOrderAndBuy", CreateTokenPlanTeamOrderAndBuyResponse.class);
    }

    /**
     *This API is used to delete specified api keys and clean up associated model binding relationships.
     * @param req DeleteApiKeyRequest
     * @return DeleteApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApiKeyResponse DeleteApiKey(DeleteApiKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApiKey", DeleteApiKeyResponse.class);
    }

    /**
     *Delete a termbase.

This API is used to delete specified Termbase and ALL terminology entries under it. The deletion is idempotent and returns a successful result for non-existing Termbase. After calling the API, if the corresponding Termbase cannot be found via DescribeGlossaries, it indicates successful deletion.
     * @param req DeleteGlossaryRequest
     * @return DeleteGlossaryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGlossaryResponse DeleteGlossary(DeleteGlossaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGlossary", DeleteGlossaryResponse.class);
    }

    /**
     *Delete terminology entries in batches.

Delete terminology entries in batches under the specified Termbase. You can delete up to 200 entries at a time. If the Termbase is nonexistent or NOT_IN this application, it returns a ResourceNotFound error.
     * @param req DeleteGlossaryEntriesRequest
     * @return DeleteGlossaryEntriesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGlossaryEntriesResponse DeleteGlossaryEntries(DeleteGlossaryEntriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGlossaryEntries", DeleteGlossaryEntriesResponse.class);
    }

    /**
     *Delete the Token Plan API key.

Simultaneously delete the limit center sub-limit package and notify the Notification Gateway to purge cache.
     * @param req DeleteTokenPlanApiKeyRequest
     * @return DeleteTokenPlanApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTokenPlanApiKeyResponse DeleteTokenPlanApiKey(DeleteTokenPlanApiKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTokenPlanApiKey", DeleteTokenPlanApiKeyResponse.class);
    }

    /**
     *This API is used to query API Key details based on API Key ID or key value, and return the plaintext key. At least one of ApiKeyId and ApiKey must be input, with priority given to ApiKeyId.
     * @param req DescribeApiKeyRequest
     * @return DescribeApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiKeyResponse DescribeApiKey(DescribeApiKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApiKey", DescribeApiKeyResponse.class);
    }

    /**
     *Query API key list.

Query the API key list of the current user with key values in masking display. Support pagination, filtering, and sorting.
     * @param req DescribeApiKeyListRequest
     * @return DescribeApiKeyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiKeyListResponse DescribeApiKeyList(DescribeApiKeyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApiKeyList", DescribeApiKeyListResponse.class);
    }

    /**
     *Query the terminology repository list.

Query the Termbase list under this application. Support paginate, filter, and sort.
     * @param req DescribeGlossariesRequest
     * @return DescribeGlossariesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGlossariesResponse DescribeGlossaries(DescribeGlossariesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGlossaries", DescribeGlossariesResponse.class);
    }

    /**
     *Query the terminology entry list.

Query specified entries in a Termbase. Support pagination.
     * @param req DescribeGlossaryEntriesRequest
     * @return DescribeGlossaryEntriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGlossaryEntriesResponse DescribeGlossaryEntries(DescribeGlossaryEntriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGlossaryEntries", DescribeGlossaryEntriesResponse.class);
    }

    /**
     *Query the TokenPlan package details.

Return the package basic info and the remaining quota of the package.
     * @param req DescribeTokenPlanRequest
     * @return DescribeTokenPlanResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTokenPlanResponse DescribeTokenPlan(DescribeTokenPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTokenPlan", DescribeTokenPlanResponse.class);
    }

    /**
     *Query TokenPlan APIKey details.

Return the complete APIKey information (including the plaintext key) and the remaining quota of the sub-quota package.
     * @param req DescribeTokenPlanApiKeyRequest
     * @return DescribeTokenPlanApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTokenPlanApiKeyResponse DescribeTokenPlanApiKey(DescribeTokenPlanApiKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTokenPlanApiKey", DescribeTokenPlanApiKeyResponse.class);
    }

    /**
     *Query the list of Token Plan API keys.

Returns the API key list under a specified package. Keys are masked. Root accounts can view all keys, while sub-accounts can only view keys created by themselves.
     * @param req DescribeTokenPlanApiKeyListRequest
     * @return DescribeTokenPlanApiKeyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTokenPlanApiKeyListResponse DescribeTokenPlanApiKeyList(DescribeTokenPlanApiKeyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTokenPlanApiKeyList", DescribeTokenPlanApiKeyListResponse.class);
    }

    /**
     *Query the TokenPlan APIKey (plaintext).

Return the plaintext key value of the designated APIKey. Keep it safe.
     * @param req DescribeTokenPlanApiKeySecretRequest
     * @return DescribeTokenPlanApiKeySecretResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTokenPlanApiKeySecretResponse DescribeTokenPlanApiKeySecret(DescribeTokenPlanApiKeySecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTokenPlanApiKeySecret", DescribeTokenPlanApiKeySecretResponse.class);
    }

    /**
     *Query the Token Plan APIKey call detail.

This API is used to query call details under a package from CLS log service, filter by team_id, and support cursor-based pagination.
     * @param req DescribeTokenPlanApiKeyUsageDetailRequest
     * @return DescribeTokenPlanApiKeyUsageDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTokenPlanApiKeyUsageDetailResponse DescribeTokenPlanApiKeyUsageDetail(DescribeTokenPlanApiKeyUsageDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTokenPlanApiKeyUsageDetail", DescribeTokenPlanApiKeyUsageDetailResponse.class);
    }

    /**
     *Query the list of Token Plan package options.

Supports pagination, filtering, and sorting. Root accounts can view all packages, while sub-accounts can only view packages created by themselves. Returned results include the main limit package details associated with each package in the limit center.
     * @param req DescribeTokenPlanListRequest
     * @return DescribeTokenPlanListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTokenPlanListResponse DescribeTokenPlanList(DescribeTokenPlanListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTokenPlanList", DescribeTokenPlanListResponse.class);
    }

    /**
     *Refresh API key information.

This API is used to update the remark information, IP allowlist and Token quota of an API key (recommended to use QuotaDesired parameter for quota modification). Passing no optional parameters means no modification.
     * @param req ModifyApiKeyInfoRequest
     * @return ModifyApiKeyInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApiKeyInfoResponse ModifyApiKeyInfo(ModifyApiKeyInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApiKeyInfo", ModifyApiKeyInfoResponse.class);
    }

    /**
     *This API is used to enable or disable the status of an api key.
     * @param req ModifyApiKeyStatusRequest
     * @return ModifyApiKeyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApiKeyStatusResponse ModifyApiKeyStatus(ModifyApiKeyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApiKeyStatus", ModifyApiKeyStatusResponse.class);
    }

    /**
     *Batch modify terminology entries.

This API is used to batch modify terminology entries in a designated Termbase. You can modify up to 200 entries at a time.
     * @param req ModifyGlossaryEntriesRequest
     * @return ModifyGlossaryEntriesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGlossaryEntriesResponse ModifyGlossaryEntries(ModifyGlossaryEntriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGlossaryEntries", ModifyGlossaryEntriesResponse.class);
    }

    /**
     *Modify the Token Plan APIKey configuration (field that the gateway focuses on).

After modification, automatically notify the gateway to update the cache and sync the limit center.
     * @param req ModifyTokenPlanApiKeyRequest
     * @return ModifyTokenPlanApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTokenPlanApiKeyResponse ModifyTokenPlanApiKey(ModifyTokenPlanApiKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTokenPlanApiKey", ModifyTokenPlanApiKeyResponse.class);
    }

    /**
     *Reset the TokenPlan API Key.

Regenerate the key value. The key version increments and the old key expires immediately. The API Key ID remains unchanged. After resetting, the new key can be queried through DescribeTokenPlanApiKeySecret.
     * @param req ModifyTokenPlanApiKeySecretRequest
     * @return ModifyTokenPlanApiKeySecretResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTokenPlanApiKeySecretResponse ModifyTokenPlanApiKeySecret(ModifyTokenPlanApiKeySecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTokenPlanApiKeySecret", ModifyTokenPlanApiKeySecretResponse.class);
    }

    /**
     *Renew a package.

Initiate a renewal order for an existing Token Plan package and complete payment. Return the order ID and associated sub-orders and resource information upon success.
     * @param req RenewTokenPlanTeamOrderRequest
     * @return RenewTokenPlanTeamOrderResponse
     * @throws TencentCloudSDKException
     */
    public RenewTokenPlanTeamOrderResponse RenewTokenPlanTeamOrder(RenewTokenPlanTeamOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewTokenPlanTeamOrder", RenewTokenPlanTeamOrderResponse.class);
    }

    /**
     *Upgrade the package.

Initiate an upgrade order for an existing Token Plan package and complete payment to expand point or token limits. Return the order ID and associated sub-orders and resource information upon success. The new limit must be greater than the current limit.
     * @param req UpgradeTokenPlanTeamOrderRequest
     * @return UpgradeTokenPlanTeamOrderResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeTokenPlanTeamOrderResponse UpgradeTokenPlanTeamOrder(UpgradeTokenPlanTeamOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeTokenPlanTeamOrder", UpgradeTokenPlanTeamOrderResponse.class);
    }

}
