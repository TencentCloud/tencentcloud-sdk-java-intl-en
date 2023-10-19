/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cloudaudit.v20190319;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cloudaudit.v20190319.models.*;

public class CloudauditClient extends AbstractClient{
    private static String endpoint = "cloudaudit.tencentcloudapi.com";
    private static String service = "cloudaudit";
    private static String version = "2019-03-19";
    
    public CloudauditClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CloudauditClient(Credential credential, String region, ClientProfile profile) {
        super(CloudauditClient.endpoint, CloudauditClient.version, credential, region, profile);
    }

    /**
     *Parameter requirements:
1. If the value of `IsCreateNewBucket` exists, `cosRegion` and `osBucketName` are required.
2. If the value of `IsEnableCmqNotify` is 1, `IsCreateNewQueue`, `CmqRegion`, and `CmqQueueName` are required.
3. If the value of `IsEnableCmqNotify` is 0, `IsCreateNewQueue`, `CmqRegion`, and `CmqQueueName` cannot be passed in.
4. If the value of `IsEnableKmsEncry` is 1, `KmsRegion` and `KeyId` are required.
     * @param req CreateAuditRequest
     * @return CreateAuditResponse
     * @throws TencentCloudSDKException
     */
    public CreateAuditResponse CreateAudit(CreateAuditRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAudit", CreateAuditResponse.class);
    }

    /**
     *This API is used to create a tracking set.
     * @param req CreateAuditTrackRequest
     * @return CreateAuditTrackResponse
     * @throws TencentCloudSDKException
     */
    public CreateAuditTrackResponse CreateAuditTrack(CreateAuditTrackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAuditTrack", CreateAuditTrackResponse.class);
    }

    /**
     *This API is used to delete a tracking set.
     * @param req DeleteAuditRequest
     * @return DeleteAuditResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAuditResponse DeleteAudit(DeleteAuditRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAudit", DeleteAuditResponse.class);
    }

    /**
     *This API is used to delete a CloudAudit tracking set.
     * @param req DeleteAuditTrackRequest
     * @return DeleteAuditTrackResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAuditTrackResponse DeleteAuditTrack(DeleteAuditTrackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAuditTrack", DeleteAuditTrackResponse.class);
    }

    /**
     *This API is used to query the details of a tracking set.
     * @param req DescribeAuditRequest
     * @return DescribeAuditResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditResponse DescribeAudit(DescribeAuditRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAudit", DescribeAuditResponse.class);
    }

    /**
     *This API is used to query the CloudAudit tracking set details.
     * @param req DescribeAuditTrackRequest
     * @return DescribeAuditTrackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditTrackResponse DescribeAuditTrack(DescribeAuditTrackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditTrack", DescribeAuditTrackResponse.class);
    }

    /**
     *This API is used to query the CloudAudit tracking set list.
     * @param req DescribeAuditTracksRequest
     * @return DescribeAuditTracksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditTracksResponse DescribeAuditTracks(DescribeAuditTracksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditTracks", DescribeAuditTracksResponse.class);
    }

    /**
     *This API is used to query CloudAudit logs.
     * @param req DescribeEventsRequest
     * @return DescribeEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventsResponse DescribeEvents(DescribeEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEvents", DescribeEventsResponse.class);
    }

    /**
     *This API is used to query the valid values of `AttributeKey`.
     * @param req GetAttributeKeyRequest
     * @return GetAttributeKeyResponse
     * @throws TencentCloudSDKException
     */
    public GetAttributeKeyResponse GetAttributeKey(GetAttributeKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAttributeKey", GetAttributeKeyResponse.class);
    }

    /**
     *This API is used to query the number of tracking sets that can be created.
     * @param req InquireAuditCreditRequest
     * @return InquireAuditCreditResponse
     * @throws TencentCloudSDKException
     */
    public InquireAuditCreditResponse InquireAuditCredit(InquireAuditCreditRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquireAuditCredit", InquireAuditCreditResponse.class);
    }

    /**
     *This API is used to query the summary of tracking sets.
     * @param req ListAuditsRequest
     * @return ListAuditsResponse
     * @throws TencentCloudSDKException
     */
    public ListAuditsResponse ListAudits(ListAuditsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAudits", ListAuditsResponse.class);
    }

    /**
     *This API is used to query CloudAudit-enabled CMQ AZs.
     * @param req ListCmqEnableRegionRequest
     * @return ListCmqEnableRegionResponse
     * @throws TencentCloudSDKException
     */
    public ListCmqEnableRegionResponse ListCmqEnableRegion(ListCmqEnableRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListCmqEnableRegion", ListCmqEnableRegionResponse.class);
    }

    /**
     *This API is used to query CloudAudit-enabled COS AZs.
     * @param req ListCosEnableRegionRequest
     * @return ListCosEnableRegionResponse
     * @throws TencentCloudSDKException
     */
    public ListCosEnableRegionResponse ListCosEnableRegion(ListCosEnableRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListCosEnableRegion", ListCosEnableRegionResponse.class);
    }

    /**
     *This API is used to search for operation logs to help query relevant operation information.
     * @param req LookUpEventsRequest
     * @return LookUpEventsResponse
     * @throws TencentCloudSDKException
     */
    public LookUpEventsResponse LookUpEvents(LookUpEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "LookUpEvents", LookUpEventsResponse.class);
    }

    /**
     *This API is used to modify a CloudAudit tracking set.
     * @param req ModifyAuditTrackRequest
     * @return ModifyAuditTrackResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAuditTrackResponse ModifyAuditTrack(ModifyAuditTrackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAuditTrack", ModifyAuditTrackResponse.class);
    }

    /**
     *This API is used to enable a tracking set.
     * @param req StartLoggingRequest
     * @return StartLoggingResponse
     * @throws TencentCloudSDKException
     */
    public StartLoggingResponse StartLogging(StartLoggingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartLogging", StartLoggingResponse.class);
    }

    /**
     *This API is used to disable a tracking set.
     * @param req StopLoggingRequest
     * @return StopLoggingResponse
     * @throws TencentCloudSDKException
     */
    public StopLoggingResponse StopLogging(StopLoggingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopLogging", StopLoggingResponse.class);
    }

    /**
     *Parameter requirements:
1. If the value of `IsCreateNewBucket` exists, `cosRegion` and `osBucketName` are required.
2. If the value of `IsEnableCmqNotify` is 1, `IsCreateNewQueue`, `CmqRegion`, and `CmqQueueName` are required.
3. If the value of `IsEnableCmqNotify` is 0, `IsCreateNewQueue`, `CmqRegion`, and `CmqQueueName` cannot be passed in.
4. If the value of `IsEnableKmsEncry` is 1, `KmsRegion` and `KeyId` are required.
     * @param req UpdateAuditRequest
     * @return UpdateAuditResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAuditResponse UpdateAudit(UpdateAuditRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAudit", UpdateAuditResponse.class);
    }

}
