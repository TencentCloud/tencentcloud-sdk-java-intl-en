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
package com.tencentcloudapi.dnspod.v20210323;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dnspod.v20210323.models.*;

public class DnspodClient extends AbstractClient{
    private static String endpoint = "dnspod.tencentcloudapi.com";
    private static String service = "dnspod";
    private static String version = "2021-03-23";

    public DnspodClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DnspodClient(Credential credential, String region, ClientProfile profile) {
        super(DnspodClient.endpoint, DnspodClient.version, credential, region, profile);
    }

    /**
     *This API is used to add a domain.

     * @param req CreateDomainRequest
     * @return CreateDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainResponse CreateDomain(CreateDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add a record.

     * @param req CreateRecordRequest
     * @return CreateRecordResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecordResponse CreateRecord(CreateRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a domain.

     * @param req DeleteDomainRequest
     * @return DeleteDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainResponse DeleteDomain(DeleteDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a record.
     * @param req DeleteRecordRequest
     * @return DeleteRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordResponse DeleteRecord(DeleteRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the information of a domain.
     * @param req DescribeDomainRequest
     * @return DescribeDomainResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainResponse DescribeDomain(DescribeDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the information of a record.
     * @param req DescribeRecordRequest
     * @return DescribeRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordResponse DescribeRecord(DescribeRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the DNS records of a domain.
     * @param req DescribeRecordListRequest
     * @return DescribeRecordListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordListResponse DescribeRecordList(DescribeRecordListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set the remarks of a domain.
     * @param req ModifyDomainRemarkRequest
     * @return ModifyDomainRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainRemarkResponse ModifyDomainRemark(ModifyDomainRemarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDomainRemarkResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainRemarkResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDomainRemark");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the status of a domain.
     * @param req ModifyDomainStatusRequest
     * @return ModifyDomainStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainStatusResponse ModifyDomainStatus(ModifyDomainStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDomainStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDomainStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a record.
     * @param req ModifyRecordRequest
     * @return ModifyRecordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordResponse ModifyRecord(ModifyRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
