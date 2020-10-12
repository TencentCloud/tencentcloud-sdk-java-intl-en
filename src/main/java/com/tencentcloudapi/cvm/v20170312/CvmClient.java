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
package com.tencentcloudapi.cvm.v20170312;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cvm.v20170312.models.*;

public class CvmClient extends AbstractClient{
    private static String endpoint = "cvm.tencentcloudapi.com";
    private static String version = "2017-03-12";

    public CvmClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CvmClient(Credential credential, String region, ClientProfile profile) {
        super(CvmClient.endpoint, CvmClient.version, credential, region, profile);
    }

    /**
     *This API is used to create CDH instances with specified configuration.
* When HostChargeType is PREPAID, the HostChargePrepaid parameter must be specified.
     * @param req AllocateHostsRequest
     * @return AllocateHostsResponse
     * @throws TencentCloudSDKException
     */
    public AllocateHostsResponse AllocateHosts(AllocateHostsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AllocateHostsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AllocateHostsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AllocateHosts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to associate key pairs with instances.

* If the public key of a key pair is written to the `SSH` configuration of the instance, users will be able to log in to the instance with the private key of the key pair.
* If the instance is already associated with a key, the old key will become invalid.
If you currently use a password to log in, you will no longer be able to do so after you associate the instance with a key.
* Batch operations are supported. The maximum number of instances in each request is 100. If any instance in the request cannot be associated with a key, you will get an error code.
     * @param req AssociateInstancesKeyPairsRequest
     * @return AssociateInstancesKeyPairsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateInstancesKeyPairsResponse AssociateInstancesKeyPairs(AssociateInstancesKeyPairsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateInstancesKeyPairsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateInstancesKeyPairsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssociateInstancesKeyPairs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to associate security groups with specified instances.
     * @param req AssociateSecurityGroupsRequest
     * @return AssociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateSecurityGroupsResponse AssociateSecurityGroups(AssociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateSecurityGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateSecurityGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssociateSecurityGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a [spread placement group](https://intl.cloud.tencent.com/document/product/213/15486?from_cn_redirect=1). After you create one, you can specify it for an instance when you [create the instance](https://intl.cloud.tencent.com/document/api/213/15730?from_cn_redirect=1), 
     * @param req CreateDisasterRecoverGroupRequest
     * @return CreateDisasterRecoverGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDisasterRecoverGroupResponse CreateDisasterRecoverGroup(CreateDisasterRecoverGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDisasterRecoverGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDisasterRecoverGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDisasterRecoverGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a new image with the system disk of an instance. The image can be used to create new instances.
     * @param req CreateImageRequest
     * @return CreateImageResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageResponse CreateImage(CreateImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateImageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateImageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateImage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an `OpenSSH RSA` key pair, which you can use to log in to a `Linux` instance.

* You only need to specify a name, and the system will automatically create a key pair and return its `ID` and the public and private keys.
* The name of the key pair must be unique.
* You can save the private key to a file and use it as an authentication method for `SSH`.
* Tencent Cloud does not save users' private keys. Be sure to save it yourself.
     * @param req CreateKeyPairRequest
     * @return CreateKeyPairResponse
     * @throws TencentCloudSDKException
     */
    public CreateKeyPairResponse CreateKeyPair(CreateKeyPairRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateKeyPairResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateKeyPairResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateKeyPair");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a [spread placement group](https://intl.cloud.tencent.com/document/product/213/15486?from_cn_redirect=1). Only empty placement groups can be deleted. To delete a non-empty group, you need to terminate all the CVM instances in it first. Otherwise, the deletion will fail.
     * @param req DeleteDisasterRecoverGroupsRequest
     * @return DeleteDisasterRecoverGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDisasterRecoverGroupsResponse DeleteDisasterRecoverGroups(DeleteDisasterRecoverGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDisasterRecoverGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDisasterRecoverGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDisasterRecoverGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete images.

* If the [ImageState](https://intl.cloud.tencent.com/document/api/213/9452?from_cn_redirect=1#image_state) of an image is `Creating` or `In Use`, it cannot be deleted. Use [DescribeImages](https://intl.cloud.tencent.com/document/api/213/9418?from_cn_redirect=1) to query the image state.
* You can only create up to 10 custom images in each region. If you have used up the quota, you can delete images to create new ones.
* A shared image cannot be deleted.
     * @param req DeleteImagesRequest
     * @return DeleteImagesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImagesResponse DeleteImages(DeleteImagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteImagesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteImagesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteImages");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete the key pairs hosted in Tencent Cloud.

* You can delete multiple key pairs at the same time.
* A key pair used by an instance or image cannot be deleted. Therefore, you need to verify whether all the key pairs have been deleted successfully.
     * @param req DeleteKeyPairsRequest
     * @return DeleteKeyPairsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteKeyPairsResponse DeleteKeyPairs(DeleteKeyPairsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteKeyPairsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteKeyPairsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteKeyPairs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the quota of [spread placement groups](https://intl.cloud.tencent.com/document/product/213/15486?from_cn_redirect=1).
     * @param req DescribeDisasterRecoverGroupQuotaRequest
     * @return DescribeDisasterRecoverGroupQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisasterRecoverGroupQuotaResponse DescribeDisasterRecoverGroupQuota(DescribeDisasterRecoverGroupQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDisasterRecoverGroupQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDisasterRecoverGroupQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDisasterRecoverGroupQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information on [spread placement groups](https://intl.cloud.tencent.com/document/product/213/15486?from_cn_redirect=1).
     * @param req DescribeDisasterRecoverGroupsRequest
     * @return DescribeDisasterRecoverGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisasterRecoverGroupsResponse DescribeDisasterRecoverGroups(DescribeDisasterRecoverGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDisasterRecoverGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDisasterRecoverGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDisasterRecoverGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of CDH instances.
     * @param req DescribeHostsRequest
     * @return DescribeHostsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostsResponse DescribeHosts(DescribeHostsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHosts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the image quota of an user account.
     * @param req DescribeImageQuotaRequest
     * @return DescribeImageQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageQuotaResponse DescribeImageQuota(DescribeImageQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImageQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query image sharing information.
     * @param req DescribeImageSharePermissionRequest
     * @return DescribeImageSharePermissionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageSharePermissionResponse DescribeImageSharePermission(DescribeImageSharePermissionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageSharePermissionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageSharePermissionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImageSharePermission");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to view the list of images.

* You specify the image ID or set filters to query the details of certain images.
* You can specify `Offset` and `Limit` to select a certain part of the results. By default, the information on the first 20 matching results is returned.
     * @param req DescribeImagesRequest
     * @return DescribeImagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImagesResponse DescribeImages(DescribeImagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImagesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImagesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImages");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of supported operating systems of imported images.
     * @param req DescribeImportImageOsRequest
     * @return DescribeImportImageOsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImportImageOsResponse DescribeImportImageOs(DescribeImportImageOsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImportImageOsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImportImageOsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImportImageOs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query a list of model families available to the current user in the current region.
     * @param req DescribeInstanceFamilyConfigsRequest
     * @return DescribeInstanceFamilyConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceFamilyConfigsResponse DescribeInstanceFamilyConfigs(DescribeInstanceFamilyConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceFamilyConfigsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceFamilyConfigsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceFamilyConfigs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the model configuration of an instance.

* You can filter the query results with `zone` or `instance-family`. For more information on filtering conditions, see [`Filter`](https://intl.cloud.tencent.com/document/api/213/15753?from_cn_redirect=1#Filter).
* If no parameter is defined, the model configuration of all the instances in the specified region will be returned.
     * @param req DescribeInstanceTypeConfigsRequest
     * @return DescribeInstanceTypeConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceTypeConfigsResponse DescribeInstanceTypeConfigs(DescribeInstanceTypeConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceTypeConfigsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceTypeConfigsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceTypeConfigs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the Virtual Network Console (VNC) URL of an instance for its login to the VNC.

* It does not support `STOPPED` CVMs.
* A VNC URL is only valid for 15 seconds. If you do not access the URL within 15 seconds, it will become invalid and you have to query a URL again.
* Once the VNC URL is accessed, it will become invalid and you have to query a URL again if needed.
* If the connection is interrupted, you can make up to 30 reconnection attempts per minute.
* After getting the value `InstanceVncUrl`, you need to append `InstanceVncUrl=xxxx` to the end of the link <https://img.qcloud.com/qcloud/app/active_vnc/index.html?>.

  - `InstanceVncUrl`: its value will be returned after the API is successfully called.

    The final URL is in the following format:

```
https://img.qcloud.com/qcloud/app/active_vnc/index.html?InstanceVncUrl=wss%3A%2F%2Fbjvnc.qcloud.com%3A26789%2Fvnc%3Fs%3DaHpjWnRVMFNhYmxKdDM5MjRHNlVTSVQwajNUSW0wb2tBbmFtREFCTmFrcy8vUUNPMG0wSHZNOUUxRm5PMmUzWmFDcWlOdDJIbUJxSTZDL0RXcHZxYnZZMmRkWWZWcEZia2lyb09XMzdKNmM9
```

     * @param req DescribeInstanceVncUrlRequest
     * @return DescribeInstanceVncUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceVncUrlResponse DescribeInstanceVncUrl(DescribeInstanceVncUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceVncUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceVncUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceVncUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of instances.

* You can filter the query results with the instance `ID`, name, or billing method. See `Filter` for more information.
* If no parameter is defined, a certain number of instances under the current account will be returned. The number is specified by `Limit` and is 20 by default.
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query limitations on operations on an instance.

* Currently you can use this API to query the maximum number of times you can modify the configuration of an instance.
     * @param req DescribeInstancesOperationLimitRequest
     * @return DescribeInstancesOperationLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesOperationLimitResponse DescribeInstancesOperationLimit(DescribeInstancesOperationLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesOperationLimitResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesOperationLimitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstancesOperationLimit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the status of instances.

* You can query the status of an instance with its `ID`.
* If no parameter is defined, the status of a certain number of instances under the current account will be returned. The number is specified by `Limit` and is 20 by default.
     * @param req DescribeInstancesStatusRequest
     * @return DescribeInstancesStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesStatusResponse DescribeInstancesStatus(DescribeInstancesStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstancesStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the network billing methods.
     * @param req DescribeInternetChargeTypeConfigsRequest
     * @return DescribeInternetChargeTypeConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInternetChargeTypeConfigsResponse DescribeInternetChargeTypeConfigs(DescribeInternetChargeTypeConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInternetChargeTypeConfigsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInternetChargeTypeConfigsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInternetChargeTypeConfigs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query key pairs.

* A key pair is a pair of keys generated by an algorithm in which the public key is available to the public and the private key is available only to the user. You can use this API to query the public key but not the private key.
     * @param req DescribeKeyPairsRequest
     * @return DescribeKeyPairsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKeyPairsResponse DescribeKeyPairs(DescribeKeyPairsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeKeyPairsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeKeyPairsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeKeyPairs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query regions.
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRegionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to list reserved instances the user has purchased.
     * @param req DescribeReservedInstancesRequest
     * @return DescribeReservedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReservedInstancesResponse DescribeReservedInstances(DescribeReservedInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReservedInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReservedInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReservedInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to describe reserved instance (RI) offerings. Currently, RIs are only offered to beta users.
     * @param req DescribeReservedInstancesConfigInfosRequest
     * @return DescribeReservedInstancesConfigInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReservedInstancesConfigInfosResponse DescribeReservedInstancesConfigInfos(DescribeReservedInstancesConfigInfosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReservedInstancesConfigInfosResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReservedInstancesConfigInfosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReservedInstancesConfigInfos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to describe Reserved Instance offerings that are available for purchase.
     * @param req DescribeReservedInstancesOfferingsRequest
     * @return DescribeReservedInstancesOfferingsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReservedInstancesOfferingsResponse DescribeReservedInstancesOfferings(DescribeReservedInstancesOfferingsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReservedInstancesOfferingsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReservedInstancesOfferingsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReservedInstancesOfferings");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query spot instances that are available for purchase.
     * @param req DescribeSpotTypeConfigRequest
     * @return DescribeSpotTypeConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpotTypeConfigResponse DescribeSpotTypeConfig(DescribeSpotTypeConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSpotTypeConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSpotTypeConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSpotTypeConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the configurations of models in an availability zone.
     * @param req DescribeZoneInstanceConfigInfosRequest
     * @return DescribeZoneInstanceConfigInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneInstanceConfigInfosResponse DescribeZoneInstanceConfigInfos(DescribeZoneInstanceConfigInfosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZoneInstanceConfigInfosResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZoneInstanceConfigInfosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeZoneInstanceConfigInfos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query availability zones.
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZonesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZonesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeZones");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to unbind one or more key pairs from one or more instances.

* It only supports [`STOPPED`](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#InstanceStatus) Linux instances.
* After a key pair is disassociated from an instance, you can log in to the instance with password.
* If you did not set a password for the instance, you will not be able to log in via SSH after the unbinding. In this case, you can call [ResetInstancesPassword](https://intl.cloud.tencent.com/document/api/213/15736?from_cn_redirect=1) to set a login password.
* Batch operations are supported. The maximum number of instances in each request is 100. If instances not available for the operation are selected, you will get an error code.
     * @param req DisassociateInstancesKeyPairsRequest
     * @return DisassociateInstancesKeyPairsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateInstancesKeyPairsResponse DisassociateInstancesKeyPairs(DisassociateInstancesKeyPairsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateInstancesKeyPairsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateInstancesKeyPairsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisassociateInstancesKeyPairs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disassociate security groups from instances.
     * @param req DisassociateSecurityGroupsRequest
     * @return DisassociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateSecurityGroupsResponse DisassociateSecurityGroups(DisassociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateSecurityGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateSecurityGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisassociateSecurityGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to import images. Imported images can be used to create instances. 
     * @param req ImportImageRequest
     * @return ImportImageResponse
     * @throws TencentCloudSDKException
     */
    public ImportImageResponse ImportImage(ImportImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ImportImageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ImportImageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ImportImage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to import key pairs.

* You can use this API to import key pairs to a user account, but the key pairs will not be automatically associated with any instance. You may use [AssociasteInstancesKeyPair](https://intl.cloud.tencent.com/document/api/213/9404?from_cn_redirect=1) to associate key pairs with instances.
* You need to specify the names of the key pairs and the content of the public keys.
* If you only have private keys, you can convert them to public keys with the `SSL` tool before importing them.
     * @param req ImportKeyPairRequest
     * @return ImportKeyPairResponse
     * @throws TencentCloudSDKException
     */
    public ImportKeyPairResponse ImportKeyPair(ImportKeyPairRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ImportKeyPairResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ImportKeyPairResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ImportKeyPair");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the price of reserved instances. It only supports querying purchasable reserved instance offerings. Currently, RIs are only offered to beta users.
     * @param req InquirePricePurchaseReservedInstancesOfferingRequest
     * @return InquirePricePurchaseReservedInstancesOfferingResponse
     * @throws TencentCloudSDKException
     */
    public InquirePricePurchaseReservedInstancesOfferingResponse InquirePricePurchaseReservedInstancesOffering(InquirePricePurchaseReservedInstancesOfferingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquirePricePurchaseReservedInstancesOfferingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquirePricePurchaseReservedInstancesOfferingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquirePricePurchaseReservedInstancesOffering");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the price for reinstalling an instance.

* If you have specified the `ImageId` parameter, the price query is performed with the specified image. Otherwise, the image used by the current instance is used.
* You can only query the price for reinstallation caused by switching between Linux and Windows OS. And the [system disk type](https://intl.cloud.tencent.com/document/api/213/15753?from_cn_redirect=1#SystemDisk) of the instance must be `CLOUD_BASIC`, `CLOUD_PREMIUM`, or `CLOUD_SSD`.
* Currently, this API only supports instances in Mainland China regions.
     * @param req InquiryPriceResetInstanceRequest
     * @return InquiryPriceResetInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceResetInstanceResponse InquiryPriceResetInstance(InquiryPriceResetInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceResetInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceResetInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceResetInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the price for upgrading the public bandwidth cap of an instance.

* The allowed bandwidth cap varies for different models. For details, see [Purchasing Network Bandwidth](https://intl.cloud.tencent.com/document/product/213/509?from_cn_redirect=1).
* For bandwidth billed by the `TRAFFIC_POSTPAID_BY_HOUR` method, changing the bandwidth cap through this API takes effect in real time. You can increase or reduce bandwidth within applicable limits.
     * @param req InquiryPriceResetInstancesInternetMaxBandwidthRequest
     * @return InquiryPriceResetInstancesInternetMaxBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceResetInstancesInternetMaxBandwidthResponse InquiryPriceResetInstancesInternetMaxBandwidth(InquiryPriceResetInstancesInternetMaxBandwidthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceResetInstancesInternetMaxBandwidthResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceResetInstancesInternetMaxBandwidthResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceResetInstancesInternetMaxBandwidth");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the price for adjusting the instance model.

* Currently, you can only use this API to query the prices of instances whose [system disk type](https://intl.cloud.tencent.com/document/api/213/9452?from_cn_redirect=1#block_device) is `CLOUD_BASIC`, `CLOUD_PREMIUM`, or `CLOUD_SSD`.
* Currently, you cannot use this API to query the prices of [CDH](https://intl.cloud.tencent.com/document/product/416?from_cn_redirect=1) instances.
     * @param req InquiryPriceResetInstancesTypeRequest
     * @return InquiryPriceResetInstancesTypeResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceResetInstancesTypeResponse InquiryPriceResetInstancesType(InquiryPriceResetInstancesTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceResetInstancesTypeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceResetInstancesTypeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceResetInstancesType");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the price for expanding data disks of an instance.

* Currently, you can only use this API to query the price of non-elastic data disks whose [disk type](https://intl.cloud.tencent.com/document/api/213/9452?from_cn_redirect=1#block_device) is `CLOUD_BASIC`, `CLOUD_PREMIUM`, or `CLOUD_SSD`. You can use [`DescribeDisks`](https://intl.cloud.tencent.com/document/api/362/16315?from_cn_redirect=1) to check whether a disk is elastic. If the `Portable` field in the response is `false`, it means that the disk is non-elastic.
* Currently, you cannot use this API to query the price for [CDH](https://intl.cloud.tencent.com/document/product/416?from_cn_redirect=1) instances. *Also, you can only query the price of expanding one data disk at a time.
     * @param req InquiryPriceResizeInstanceDisksRequest
     * @return InquiryPriceResizeInstanceDisksResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceResizeInstanceDisksResponse InquiryPriceResizeInstanceDisks(InquiryPriceResizeInstanceDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceResizeInstanceDisksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceResizeInstanceDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceResizeInstanceDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the price of creating instances. You can only use this API for instances whose configuration is within the purchase limit. For more information, see [RunInstances](https://intl.cloud.tencent.com/document/api/213/15730?from_cn_redirect=1).
     * @param req InquiryPriceRunInstancesRequest
     * @return InquiryPriceRunInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceRunInstancesResponse InquiryPriceRunInstances(InquiryPriceRunInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceRunInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceRunInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceRunInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the attributes of [spread placement groups](https://intl.cloud.tencent.com/document/product/213/15486?from_cn_redirect=1).
     * @param req ModifyDisasterRecoverGroupAttributeRequest
     * @return ModifyDisasterRecoverGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDisasterRecoverGroupAttributeResponse ModifyDisasterRecoverGroupAttribute(ModifyDisasterRecoverGroupAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDisasterRecoverGroupAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDisasterRecoverGroupAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDisasterRecoverGroupAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the attributes of a CDH instance, such as instance name and renewal flag. One of the two parameters, HostName and RenewFlag, must be set, but you cannot set both of them at the same time.
     * @param req ModifyHostsAttributeRequest
     * @return ModifyHostsAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHostsAttributeResponse ModifyHostsAttribute(ModifyHostsAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyHostsAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyHostsAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyHostsAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify image attributes.

* Attributes of shared images cannot be modified.
     * @param req ModifyImageAttributeRequest
     * @return ModifyImageAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyImageAttributeResponse ModifyImageAttribute(ModifyImageAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyImageAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyImageAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyImageAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify image sharing information.

* The accounts with which an image is shared can use the shared image to create instances.
* Each custom image can be shared with up to 50 accounts.
* You can use a shared image to create instances, but you cannot change its name and description.
* If an image is shared with another account, the shared image will be in the same region as the original image.

     * @param req ModifyImageSharePermissionRequest
     * @return ModifyImageSharePermissionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyImageSharePermissionResponse ModifyImageSharePermission(ModifyImageSharePermissionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyImageSharePermissionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyImageSharePermissionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyImageSharePermission");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the attributes of an instance. Currently you can only use the API to modify the name and the associated security groups of the instance.

* Instance names are used only for users' convenience. Tencent Cloud does not use the name for ticket submission or instance management.
* Batch operations are supported. The maximum number of instances in each request is 100.
* When you change the security groups associated with an instance, the original security groups will be disassociated.
     * @param req ModifyInstancesAttributeRequest
     * @return ModifyInstancesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesAttributeResponse ModifyInstancesAttribute(ModifyInstancesAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstancesAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstancesAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInstancesAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to change the project to which an instance belongs.

* Project is a virtual concept. You can create multiple projects under one account, manage different resources in each project, and assign different instances to different projects. You may use the [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) API to query instances and use the project ID to filter results.
* You cannot modify the project of an instance that is bound to a load balancer. You need to firstly unbind the load balancer from the instance by using the [`DeregisterInstancesFromLoadBalancer`](https://intl.cloud.tencent.com/document/api/214/1258?from_cn_redirect=1) API.
[^_^]: # (If you modify the project of an instance, security groups associated with the instance will be automatically disassociated. You can use the [`ModifyInstancesAttribute`](https://intl.cloud.tencent.com/document/api/213/15739?from_cn_redirect=1) API to associate the instance with the security groups again.
* Batch operations are supported. You can operate up to 100 instances in each request.
* You can call the [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1#.E7.A4.BA.E4.BE.8B3-.E6.9F.A5.E8.AF.A2.E5.AE.9E.E4.BE.8B.E7.9A.84.E6.9C.80.E6.96.B0.E6.93.8D.E4.BD.9C.E6.83.85.E5.86.B5) API and find the result of the operation in the response parameter `LatestOperationState`. If the value is `SUCCESS`, the operation is successful.
     * @param req ModifyInstancesProjectRequest
     * @return ModifyInstancesProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesProjectResponse ModifyInstancesProject(ModifyInstancesProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstancesProjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstancesProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInstancesProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the VPC attributes of an instance, such as the VPC IP address.
* By default, the instances will shut down when you perform this operation and restart upon completion.
* If the specified VPC ID and subnet ID (the subnet must be in the same availability zone as the instance) are different from the VPC where the specified instance resides, the instance will be migrated to a subnet of the specified VPC. Before performing this operation, make sure that the specified instance is not bound with an [ENI](https://intl.cloud.tencent.com/document/product/576?from_cn_redirect=1) or [CLB](https://intl.cloud.tencent.com/document/product/214?from_cn_redirect=1).
     * @param req ModifyInstancesVpcAttributeRequest
     * @return ModifyInstancesVpcAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesVpcAttributeResponse ModifyInstancesVpcAttribute(ModifyInstancesVpcAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstancesVpcAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstancesVpcAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInstancesVpcAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the attributes of key pairs.

* This API modifies the name and description of the key pair identified by the key pair ID.
* The name of the key pair must be unique.
* Key pair ID is the unique identifier of a key pair and cannot be modified.
     * @param req ModifyKeyPairAttributeRequest
     * @return ModifyKeyPairAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyKeyPairAttributeResponse ModifyKeyPairAttribute(ModifyKeyPairAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyKeyPairAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyKeyPairAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyKeyPairAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to purchase one or more specific Reserved Instances.
     * @param req PurchaseReservedInstancesOfferingRequest
     * @return PurchaseReservedInstancesOfferingResponse
     * @throws TencentCloudSDKException
     */
    public PurchaseReservedInstancesOfferingResponse PurchaseReservedInstancesOffering(PurchaseReservedInstancesOfferingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PurchaseReservedInstancesOfferingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PurchaseReservedInstancesOfferingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PurchaseReservedInstancesOffering");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to restart instances.

* You can only perform this operation on instances whose status is `RUNNING`.
* If the API is called successfully, the instance status will become `REBOOTING`. After the instance is restarted, its status will become `RUNNING` again.
* Forced restart is supported. A forced restart is similar to switching off the power of a physical computer and starting it again. It may cause data loss or file system corruption. Be sure to only force start a CVM when it cannot be restarted normally.
* Batch operations are supported. The maximum number of instances in each request is 100.
     * @param req RebootInstancesRequest
     * @return RebootInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RebootInstancesResponse RebootInstances(RebootInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RebootInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RebootInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RebootInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to reinstall the operating system of the specified instance.

* If you specify an `ImageId`, the specified image is used. Otherwise, the image used by the current instance is used.
* The system disk will be formatted and reset. Therefore, make sure that no important files are stored on the system disk.
* If the operating system switches between `Linux` and `Windows`, the system disk `ID` of the instance will change, and the snapshots that are associated with the system disk can no longer be used to roll back and restore data.
* If no password is specified, you will get a random password via internal message.
* You can only use this API to switch the operating system between `Linux` and `Windows` for instances whose [system disk type](https://intl.cloud.tencent.com/document/api/213/9452?from_cn_redirect=1#SystemDisk) is `CLOUD_BASIC`, `CLOUD_PREMIUM`, or `CLOUD_SSD`.
* Currently, this API only supports instances in Mainland China regions.
     * @param req ResetInstanceRequest
     * @return ResetInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstanceResponse ResetInstance(ResetInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to change the public bandwidth cap of an instance.

* The allowed bandwidth cap varies for different models. For details, see [Purchasing Network Bandwidth](https://intl.cloud.tencent.com/document/product/213/509?from_cn_redirect=1).
* For bandwidth billed by the `TRAFFIC_POSTPAID_BY_HOUR` method, changing the bandwidth cap through this API takes effect in real time. Users can increase or reduce bandwidth within applicable limits.
     * @param req ResetInstancesInternetMaxBandwidthRequest
     * @return ResetInstancesInternetMaxBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstancesInternetMaxBandwidthResponse ResetInstancesInternetMaxBandwidth(ResetInstancesInternetMaxBandwidthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetInstancesInternetMaxBandwidthResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetInstancesInternetMaxBandwidthResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetInstancesInternetMaxBandwidth");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to reset the password of the operating system instances to a user-specified password.

* To modify the password of the administrator account: the name of the administrator account varies with the operating system. In Windows, it is `Administrator`; in Ubuntu, it is `ubuntu`; in Linux, it is `root`.
* To reset the password of a running instance, you need to set the parameter `ForceStop` to `True` for a forced shutdown. If not, only passwords of stopped instances can be reset.
* Batch operations are supported. You can reset the passwords of up to 100 instances to the same value once.
* You can call the [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1#.E7.A4.BA.E4.BE.8B3-.E6.9F.A5.E8.AF.A2.E5.AE.9E.E4.BE.8B.E7.9A.84.E6.9C.80.E6.96.B0.E6.93.8D.E4.BD.9C.E6.83.85.E5.86.B5) API and find the result of the operation in the response parameter `LatestOperationState`. If the value is `SUCCESS`, the operation is successful.
     * @param req ResetInstancesPasswordRequest
     * @return ResetInstancesPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstancesPasswordResponse ResetInstancesPassword(ResetInstancesPasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetInstancesPasswordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetInstancesPasswordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetInstancesPassword");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to change the model of an instance.
* You can only use this API to change the models of instances whose [system disk type](https://intl.cloud.tencent.com/document/api/213/9452?from_cn_redirect=1#block_device) is `CLOUD_BASIC`, `CLOUD_PREMIUM`, or `CLOUD_SSD`.
* Currently, you cannot use this API to change the models of [CDH](https://intl.cloud.tencent.com/document/product/416?from_cn_redirect=1) instances.
     * @param req ResetInstancesTypeRequest
     * @return ResetInstancesTypeResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstancesTypeResponse ResetInstancesType(ResetInstancesTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetInstancesTypeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetInstancesTypeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetInstancesType");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ResizeInstanceDisks) is used to expand the data disks of an instance.

* Currently, you can only use the API to expand non-elastic data disks whose [disk type](https://intl.cloud.tencent.com/document/api/213/9452?from_cn_redirect=1#block_device) is `CLOUD_BASIC`, `CLOUD_PREMIUM`, or `CLOUD_SSD`. You can use [`DescribeDisks`](https://intl.cloud.tencent.com/document/api/362/16315?from_cn_redirect=1) to check whether a disk is elastic. If the `Portable` field in the response is `false`, it means that the disk is non-elastic.
* Currently, this API does not support [CDH](https://intl.cloud.tencent.com/document/product/416?from_cn_redirect=1) instances.
* Currently, only one data disk can be expanded at a time.
     * @param req ResizeInstanceDisksRequest
     * @return ResizeInstanceDisksResponse
     * @throws TencentCloudSDKException
     */
    public ResizeInstanceDisksResponse ResizeInstanceDisks(ResizeInstanceDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResizeInstanceDisksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResizeInstanceDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResizeInstanceDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create one or more instances with a specified configuration.

* After an instance is created successfully, it will start up automatically, and the [instance state](https://intl.cloud.tencent.com/document/api/213/9452?from_cn_redirect=1#instance_state) will become "Running".
* If you create a pay-as-you-go instance billed on an hourly basis, an amount equivalent to the hourly rate will be frozen before the creation. Make sure your account balance is sufficient before calling this API.
* The number of instances you can purchase through this API is subject to the [CVM instance purchase limit](https://intl.cloud.tencent.com/document/product/213/2664?from_cn_redirect=1). Both the instances created through this API and the console will be counted toward the quota.
* This API is an async API. An instance `ID` list will be returned after you successfully make a creation request. However, it does not mean the creation has been completed. The state of the instance will be `Creating` during the creation. You can use [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) to query the status of the instance. If the status changes from `Creating` to `Running`, it means that the instance has been created successfully.
     * @param req RunInstancesRequest
     * @return RunInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RunInstancesResponse RunInstances(RunInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RunInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RunInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RunInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to start instances.

* You can only perform this operation on instances whose status is `STOPPED`.
* The instance status will become `STARTING` when the API is called successfully and `RUNNING` when the instance is successfully started.
* Batch operations are supported. The maximum number of instances in each request is 100.
     * @param req StartInstancesRequest
     * @return StartInstancesResponse
     * @throws TencentCloudSDKException
     */
    public StartInstancesResponse StartInstances(StartInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to shut down instances.

* You can only perform this operation on instances whose status is `RUNNING`.
* The instance status will become `STOPPING` when the API is called successfully and `STOPPED` when the instance is successfully shut down.
* Forced shutdown is supported. A forced shutdown is similar to switching off the power of a physical computer. It may cause data loss or file system corruption. Be sure to only force shut down a CVM when it cannot be sht down normally.
* Batch operations are supported. The maximum number of instances in each request is 100.
     * @param req StopInstancesRequest
     * @return StopInstancesResponse
     * @throws TencentCloudSDKException
     */
    public StopInstancesResponse StopInstances(StopInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to sync a custom image to other regions.

* Each API call syncs a single image.
* This API supports syncing an image to multiple regions.
* Each account can have up to 10 custom images in each region. 
     * @param req SyncImagesRequest
     * @return SyncImagesResponse
     * @throws TencentCloudSDKException
     */
    public SyncImagesResponse SyncImages(SyncImagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SyncImagesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SyncImagesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SyncImages");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to return instances.

* Use this API to return instances that are no longer required.
* Pay-as-you-go instances can be returned directly through this API.
* When this API is called for the first time, the instance will be moved to the recycle bin. When this API is called for the second time, the instance will be terminated and cannot be recovered.
* Batch operations are supported. The allowed maximum number of instances in each request is 100.
     * @param req TerminateInstancesRequest
     * @return TerminateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public TerminateInstancesResponse TerminateInstances(TerminateInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminateInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TerminateInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TerminateInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
