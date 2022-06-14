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
package com.tencentcloudapi.redis.v20180412;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.redis.v20180412.models.*;

public class RedisClient extends AbstractClient{
    private static String endpoint = "redis.tencentcloudapi.com";
    private static String service = "redis";
    private static String version = "2018-04-12";

    public RedisClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public RedisClient(Credential credential, String region, ClientProfile profile) {
        super(RedisClient.endpoint, RedisClient.version, credential, region, profile);
    }

    /**
     *This API is used to enable public network access.
     * @param req AllocateWanAddressRequest
     * @return AllocateWanAddressResponse
     * @throws TencentCloudSDKException
     */
    public AllocateWanAddressResponse AllocateWanAddress(AllocateWanAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AllocateWanAddressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AllocateWanAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AllocateWanAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to promote a replica node group of a multi-AZ deployed instance to master node group or a replica node of a single-AZ deployed instance to master node.
     * @param req ChangeReplicaToMasterRequest
     * @return ChangeReplicaToMasterResponse
     * @throws TencentCloudSDKException
     */
    public ChangeReplicaToMasterResponse ChangeReplicaToMaster(ChangeReplicaToMasterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChangeReplicaToMasterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ChangeReplicaToMasterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChangeReplicaToMaster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to view instance sub-account information.
     * @param req DescribeInstanceAccountRequest
     * @return DescribeInstanceAccountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceAccountResponse DescribeInstanceAccount(DescribeInstanceAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceAccountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the big key of an instance.
     * @param req DescribeInstanceMonitorBigKeyRequest
     * @return DescribeInstanceMonitorBigKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorBigKeyResponse DescribeInstanceMonitorBigKey(DescribeInstanceMonitorBigKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceMonitorBigKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceMonitorBigKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceMonitorBigKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the big key size distribution of an instance.
     * @param req DescribeInstanceMonitorBigKeySizeDistRequest
     * @return DescribeInstanceMonitorBigKeySizeDistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorBigKeySizeDistResponse DescribeInstanceMonitorBigKeySizeDist(DescribeInstanceMonitorBigKeySizeDistRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceMonitorBigKeySizeDistResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceMonitorBigKeySizeDistResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceMonitorBigKeySizeDist");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the big key type distribution of an instance
     * @param req DescribeInstanceMonitorBigKeyTypeDistRequest
     * @return DescribeInstanceMonitorBigKeyTypeDistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorBigKeyTypeDistResponse DescribeInstanceMonitorBigKeyTypeDist(DescribeInstanceMonitorBigKeyTypeDistRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceMonitorBigKeyTypeDistResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceMonitorBigKeyTypeDistResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceMonitorBigKeyTypeDist");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the hot key of an instance.
     * @param req DescribeInstanceMonitorHotKeyRequest
     * @return DescribeInstanceMonitorHotKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorHotKeyResponse DescribeInstanceMonitorHotKey(DescribeInstanceMonitorHotKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceMonitorHotKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceMonitorHotKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceMonitorHotKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the access source information of an instance.
     * @param req DescribeInstanceMonitorSIPRequest
     * @return DescribeInstanceMonitorSIPResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorSIPResponse DescribeInstanceMonitorSIP(DescribeInstanceMonitorSIPRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceMonitorSIPResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceMonitorSIPResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceMonitorSIP");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the distribution of instance access duration.
     * @param req DescribeInstanceMonitorTookDistRequest
     * @return DescribeInstanceMonitorTookDistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorTookDistResponse DescribeInstanceMonitorTookDist(DescribeInstanceMonitorTookDistRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceMonitorTookDistResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceMonitorTookDistResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceMonitorTookDist");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query an instance access command.
     * @param req DescribeInstanceMonitorTopNCmdRequest
     * @return DescribeInstanceMonitorTopNCmdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorTopNCmdResponse DescribeInstanceMonitorTopNCmd(DescribeInstanceMonitorTopNCmdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceMonitorTopNCmdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceMonitorTopNCmdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceMonitorTopNCmd");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the instance CPU time.
     * @param req DescribeInstanceMonitorTopNCmdTookRequest
     * @return DescribeInstanceMonitorTopNCmdTookResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorTopNCmdTookResponse DescribeInstanceMonitorTopNCmdTook(DescribeInstanceMonitorTopNCmdTookRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceMonitorTopNCmdTookResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceMonitorTopNCmdTookResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceMonitorTopNCmdTook");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query instance node information.
     * @param req DescribeInstanceNodeInfoRequest
     * @return DescribeInstanceNodeInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceNodeInfoResponse DescribeInstanceNodeInfo(DescribeInstanceNodeInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceNodeInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceNodeInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceNodeInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query instance maintenance window. The maintenance window specifies a time period during which compatible version upgrade, architecture upgrade, backend maintenance, and other operations can be performed to avoid affecting business.
     * @param req DescribeMaintenanceWindowRequest
     * @return DescribeMaintenanceWindowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMaintenanceWindowResponse DescribeMaintenanceWindow(DescribeMaintenanceWindowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMaintenanceWindowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMaintenanceWindowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMaintenanceWindow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the purchasable capacity specifications of Redis instances in the specified AZ and instance type. If you are not in the allowlist for the AZ or instance type, you cannot view the details of the capacity specifications. To apply for the eligibility, please submit a ticket.
     * @param req DescribeProductInfoRequest
     * @return DescribeProductInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductInfoResponse DescribeProductInfo(DescribeProductInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProductInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProductInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProductInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the global replication group.
     * @param req DescribeReplicationGroupRequest
     * @return DescribeReplicationGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReplicationGroupResponse DescribeReplicationGroup(DescribeReplicationGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReplicationGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReplicationGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReplicationGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the slow log.
     * @param req DescribeSlowLogRequest
     * @return DescribeSlowLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogResponse DescribeSlowLog(DescribeSlowLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSlowLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSlowLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSlowLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the price for purchasing an instance.
     * @param req InquiryPriceCreateInstanceRequest
     * @return InquiryPriceCreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateInstanceResponse InquiryPriceCreateInstance(InquiryPriceCreateInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceCreateInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceCreateInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceCreateInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the price for scaling an instance.
     * @param req InquiryPriceUpgradeInstanceRequest
     * @return InquiryPriceUpgradeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceUpgradeInstanceResponse InquiryPriceUpgradeInstance(InquiryPriceUpgradeInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceUpgradeInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceUpgradeInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceUpgradeInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to change the Redis password.
     * @param req ModfiyInstancePasswordRequest
     * @return ModfiyInstancePasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModfiyInstancePasswordResponse ModfiyInstancePassword(ModfiyInstancePasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModfiyInstancePasswordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModfiyInstancePasswordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModfiyInstancePassword");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set instance input mode.
     * @param req ModifyInstanceReadOnlyRequest
     * @return ModifyInstanceReadOnlyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceReadOnlyResponse ModifyInstanceReadOnly(ModifyInstanceReadOnlyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstanceReadOnlyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstanceReadOnlyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInstanceReadOnly");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disable public network access.
     * @param req ReleaseWanAddressRequest
     * @return ReleaseWanAddressResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseWanAddressResponse ReleaseWanAddress(ReleaseWanAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReleaseWanAddressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReleaseWanAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReleaseWanAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to upgrade instance proxy version.
     * @param req UpgradeProxyVersionRequest
     * @return UpgradeProxyVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeProxyVersionResponse UpgradeProxyVersion(UpgradeProxyVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeProxyVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeProxyVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeProxyVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to upgrade instance minor version.
     * @param req UpgradeSmallVersionRequest
     * @return UpgradeSmallVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeSmallVersionResponse UpgradeSmallVersion(UpgradeSmallVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeSmallVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeSmallVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeSmallVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
