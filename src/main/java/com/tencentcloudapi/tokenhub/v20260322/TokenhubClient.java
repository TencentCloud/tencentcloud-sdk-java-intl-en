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

}
