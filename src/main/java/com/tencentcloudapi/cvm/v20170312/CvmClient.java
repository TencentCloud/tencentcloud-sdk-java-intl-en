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
    private static String service = "cvm";
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
        req.setSkipSign(false);
        return this.internalRequest(req, "AllocateHosts", AllocateHostsResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateInstancesKeyPairs", AssociateInstancesKeyPairsResponse.class);
    }

    /**
     *This API is used to associate security groups with specified instances.
     * @param req AssociateSecurityGroupsRequest
     * @return AssociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateSecurityGroupsResponse AssociateSecurityGroups(AssociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateSecurityGroups", AssociateSecurityGroupsResponse.class);
    }

    /**
     *This API is used to configure the out-of-band network and deployment network of a CHC host.
     * @param req ConfigureChcAssistVpcRequest
     * @return ConfigureChcAssistVpcResponse
     * @throws TencentCloudSDKException
     */
    public ConfigureChcAssistVpcResponse ConfigureChcAssistVpc(ConfigureChcAssistVpcRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ConfigureChcAssistVpc", ConfigureChcAssistVpcResponse.class);
    }

    /**
     *This API is used to configure the deployment network of a CHC host.
     * @param req ConfigureChcDeployVpcRequest
     * @return ConfigureChcDeployVpcResponse
     * @throws TencentCloudSDKException
     */
    public ConfigureChcDeployVpcResponse ConfigureChcDeployVpc(ConfigureChcDeployVpcRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ConfigureChcDeployVpc", ConfigureChcDeployVpcResponse.class);
    }

    /**
     *This API is used to switch the operating system of an instance with CentOS 7 or CentOS 8 as the source operating system.
     * @param req ConvertOperatingSystemsRequest
     * @return ConvertOperatingSystemsResponse
     * @throws TencentCloudSDKException
     */
    public ConvertOperatingSystemsResponse ConvertOperatingSystems(ConvertOperatingSystemsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ConvertOperatingSystems", ConvertOperatingSystemsResponse.class);
    }

    /**
     *This API is used to create a [spread placement group](https://intl.cloud.tencent.com/document/product/213/15486?from_cn_redirect=1). After you create one, you can specify it for an instance when you [create the instance](https://intl.cloud.tencent.com/document/api/213/15730?from_cn_redirect=1),
     * @param req CreateDisasterRecoverGroupRequest
     * @return CreateDisasterRecoverGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDisasterRecoverGroupResponse CreateDisasterRecoverGroup(CreateDisasterRecoverGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDisasterRecoverGroup", CreateDisasterRecoverGroupResponse.class);
    }

    /**
     *This API is used to create a new image with the system disk of an instance. The image can be used to create new instances.
     * @param req CreateImageRequest
     * @return CreateImageResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageResponse CreateImage(CreateImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImage", CreateImageResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateKeyPair", CreateKeyPairResponse.class);
    }

    /**
     *This API is used to create an instance launch template.

An instance launch template contains the configuration information required to create an instance, including instance type, data/system disk type and size, and security group, etc.

When a template is created, it defaults to Version 1. You can use `CreateLaunchTemplateVersion` to create new versions of this template, with the version number increasing. When you run `RunInstances` to create instances, you can specify the instance launch template version. If it's not specified, the default template version is used.
     * @param req CreateLaunchTemplateRequest
     * @return CreateLaunchTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateLaunchTemplateResponse CreateLaunchTemplate(CreateLaunchTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLaunchTemplate", CreateLaunchTemplateResponse.class);
    }

    /**
     *This API is used to create an instance launch template based on the specified template ID and the corresponding template version number. The default version number will be used when no template version numbers are specified. Each instance launch template can have up to 30 version numbers.
     * @param req CreateLaunchTemplateVersionRequest
     * @return CreateLaunchTemplateVersionResponse
     * @throws TencentCloudSDKException
     */
    public CreateLaunchTemplateVersionResponse CreateLaunchTemplateVersion(CreateLaunchTemplateVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLaunchTemplateVersion", CreateLaunchTemplateVersionResponse.class);
    }

    /**
     *This API is used to delete a [spread placement group](https://intl.cloud.tencent.com/document/product/213/15486?from_cn_redirect=1). Only empty placement groups can be deleted. To delete a non-empty group, you need to terminate all the CVM instances in it first. Otherwise, the deletion will fail.
     * @param req DeleteDisasterRecoverGroupsRequest
     * @return DeleteDisasterRecoverGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDisasterRecoverGroupsResponse DeleteDisasterRecoverGroups(DeleteDisasterRecoverGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDisasterRecoverGroups", DeleteDisasterRecoverGroupsResponse.class);
    }

    /**
     *This API is used to delete one or more images.

* If the [ImageState](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#Image) of an image is `CREATING` or `USING`, the image cannot be deleted. Call the [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) API to query the image status.
* Up to 10 custom images are allowed in each region. If you have run out of the quota, delete unused images to create new ones.
* A shared image cannot be deleted.
     * @param req DeleteImagesRequest
     * @return DeleteImagesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImagesResponse DeleteImages(DeleteImagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteImages", DeleteImagesResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteKeyPairs", DeleteKeyPairsResponse.class);
    }

    /**
     *This API is used to delete an instance launch template.
     * @param req DeleteLaunchTemplateRequest
     * @return DeleteLaunchTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLaunchTemplateResponse DeleteLaunchTemplate(DeleteLaunchTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLaunchTemplate", DeleteLaunchTemplateResponse.class);
    }

    /**
     *This API is used to delete one or more instance launch template versions.
     * @param req DeleteLaunchTemplateVersionsRequest
     * @return DeleteLaunchTemplateVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLaunchTemplateVersionsResponse DeleteLaunchTemplateVersions(DeleteLaunchTemplateVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLaunchTemplateVersions", DeleteLaunchTemplateVersionsResponse.class);
    }

    /**
     *This API is used to query the actions not allowed for the specified CHC instances.
     * @param req DescribeChcDeniedActionsRequest
     * @return DescribeChcDeniedActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChcDeniedActionsResponse DescribeChcDeniedActions(DescribeChcDeniedActionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeChcDeniedActions", DescribeChcDeniedActionsResponse.class);
    }

    /**
     *This API is used to query the details of one or more CHC host.

* You can filter the query results with the instance ID, name or device type. See `Filter` for more information.
* If no parameter is defined, a certain number of instances under the current account will be returned. The number is specified by `Limit` and is `20` by default.
     * @param req DescribeChcHostsRequest
     * @return DescribeChcHostsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChcHostsResponse DescribeChcHosts(DescribeChcHostsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeChcHosts", DescribeChcHostsResponse.class);
    }

    /**
     *This API is used to query the quota of [spread placement groups](https://intl.cloud.tencent.com/document/product/213/15486?from_cn_redirect=1).
     * @param req DescribeDisasterRecoverGroupQuotaRequest
     * @return DescribeDisasterRecoverGroupQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisasterRecoverGroupQuotaResponse DescribeDisasterRecoverGroupQuota(DescribeDisasterRecoverGroupQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDisasterRecoverGroupQuota", DescribeDisasterRecoverGroupQuotaResponse.class);
    }

    /**
     *This API is used to query the information on [spread placement groups](https://intl.cloud.tencent.com/document/product/213/15486?from_cn_redirect=1).
     * @param req DescribeDisasterRecoverGroupsRequest
     * @return DescribeDisasterRecoverGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisasterRecoverGroupsResponse DescribeDisasterRecoverGroups(DescribeDisasterRecoverGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDisasterRecoverGroups", DescribeDisasterRecoverGroupsResponse.class);
    }

    /**
     *This API is used to query the details of CDH instances.
     * @param req DescribeHostsRequest
     * @return DescribeHostsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostsResponse DescribeHosts(DescribeHostsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHosts", DescribeHostsResponse.class);
    }

    /**
     *This API is used to view information about available images within an image family.
     * @param req DescribeImageFromFamilyRequest
     * @return DescribeImageFromFamilyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageFromFamilyResponse DescribeImageFromFamily(DescribeImageFromFamilyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageFromFamily", DescribeImageFromFamilyResponse.class);
    }

    /**
     *This API is used to query the image quota of an user account.
     * @param req DescribeImageQuotaRequest
     * @return DescribeImageQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageQuotaResponse DescribeImageQuota(DescribeImageQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageQuota", DescribeImageQuotaResponse.class);
    }

    /**
     *This API is used to query image sharing information.
     * @param req DescribeImageSharePermissionRequest
     * @return DescribeImageSharePermissionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageSharePermissionResponse DescribeImageSharePermission(DescribeImageSharePermissionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageSharePermission", DescribeImageSharePermissionResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImages", DescribeImagesResponse.class);
    }

    /**
     *This API is used to query the list of supported operating systems of imported images.
     * @param req DescribeImportImageOsRequest
     * @return DescribeImportImageOsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImportImageOsResponse DescribeImportImageOs(DescribeImportImageOsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImportImageOs", DescribeImportImageOsResponse.class);
    }

    /**
     *This API is used to query a list of model families available to the current user in the current region.
     * @param req DescribeInstanceFamilyConfigsRequest
     * @return DescribeInstanceFamilyConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceFamilyConfigsResponse DescribeInstanceFamilyConfigs(DescribeInstanceFamilyConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceFamilyConfigs", DescribeInstanceFamilyConfigsResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *This API is used to query limitations on operations on an instance.

* Currently you can use this API to query the maximum number of times you can modify the configuration of an instance.
     * @param req DescribeInstancesOperationLimitRequest
     * @return DescribeInstancesOperationLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesOperationLimitResponse DescribeInstancesOperationLimit(DescribeInstancesOperationLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancesOperationLimit", DescribeInstancesOperationLimitResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancesStatus", DescribeInstancesStatusResponse.class);
    }

    /**
     *This API is used to query the network billing methods.
     * @param req DescribeInternetChargeTypeConfigsRequest
     * @return DescribeInternetChargeTypeConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInternetChargeTypeConfigsResponse DescribeInternetChargeTypeConfigs(DescribeInternetChargeTypeConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInternetChargeTypeConfigs", DescribeInternetChargeTypeConfigsResponse.class);
    }

    /**
     *This API is used to query key pairs.

* A key pair is a pair of keys generated by an algorithm in which the public key is available to the public and the private key is available only to the user. You can use this API to query the public key but not the private key.
     * @param req DescribeKeyPairsRequest
     * @return DescribeKeyPairsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKeyPairsResponse DescribeKeyPairs(DescribeKeyPairsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKeyPairs", DescribeKeyPairsResponse.class);
    }

    /**
     *This API is used to query the information of instance launch template versions.
     * @param req DescribeLaunchTemplateVersionsRequest
     * @return DescribeLaunchTemplateVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLaunchTemplateVersionsResponse DescribeLaunchTemplateVersions(DescribeLaunchTemplateVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLaunchTemplateVersions", DescribeLaunchTemplateVersionsResponse.class);
    }

    /**
     *This API is used to query one or more instance launch templates.
     * @param req DescribeLaunchTemplatesRequest
     * @return DescribeLaunchTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLaunchTemplatesResponse DescribeLaunchTemplates(DescribeLaunchTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLaunchTemplates", DescribeLaunchTemplatesResponse.class);
    }

    /**
     *This API is suspended. To query the information of regions, use [DescribeZones](https://intl.cloud.tencent.com/document/product/1596/77930?from_cn_redirect=1).
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegions", DescribeRegionsResponse.class);
    }

    /**
     *This API is used to describe reserved instance (RI) offerings. Currently, RIs are only offered to beta users.
     * @param req DescribeReservedInstancesConfigInfosRequest
     * @return DescribeReservedInstancesConfigInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReservedInstancesConfigInfosResponse DescribeReservedInstancesConfigInfos(DescribeReservedInstancesConfigInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReservedInstancesConfigInfos", DescribeReservedInstancesConfigInfosResponse.class);
    }

    /**
     *This API is used to describe Reserved Instance offerings that are available for purchase.
     * @param req DescribeReservedInstancesOfferingsRequest
     * @return DescribeReservedInstancesOfferingsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReservedInstancesOfferingsResponse DescribeReservedInstancesOfferings(DescribeReservedInstancesOfferingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReservedInstancesOfferings", DescribeReservedInstancesOfferingsResponse.class);
    }

    /**
     *This API is used to query the configurations of models in an availability zone.
     * @param req DescribeZoneInstanceConfigInfosRequest
     * @return DescribeZoneInstanceConfigInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneInstanceConfigInfosResponse DescribeZoneInstanceConfigInfos(DescribeZoneInstanceConfigInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZoneInstanceConfigInfos", DescribeZoneInstanceConfigInfosResponse.class);
    }

    /**
     *This API is used to query availability zones.
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZones", DescribeZonesResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateInstancesKeyPairs", DisassociateInstancesKeyPairsResponse.class);
    }

    /**
     *This API is used to disassociate security groups from instances.
     * @param req DisassociateSecurityGroupsRequest
     * @return DisassociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateSecurityGroupsResponse DisassociateSecurityGroups(DisassociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateSecurityGroups", DisassociateSecurityGroupsResponse.class);
    }

    /**
     *This API is used to enter the rescue mode.
     * @param req EnterRescueModeRequest
     * @return EnterRescueModeResponse
     * @throws TencentCloudSDKException
     */
    public EnterRescueModeResponse EnterRescueMode(EnterRescueModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnterRescueMode", EnterRescueModeResponse.class);
    }

    /**
     *This API is used to exit the rescue mode.
     * @param req ExitRescueModeRequest
     * @return ExitRescueModeResponse
     * @throws TencentCloudSDKException
     */
    public ExitRescueModeResponse ExitRescueMode(ExitRescueModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExitRescueMode", ExitRescueModeResponse.class);
    }

    /**
     *This API is used to export custom images to the specified COS bucket.
     * @param req ExportImagesRequest
     * @return ExportImagesResponse
     * @throws TencentCloudSDKException
     */
    public ExportImagesResponse ExportImages(ExportImagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportImages", ExportImagesResponse.class);
    }

    /**
     *This API is used to import an image. The image imported can be used to create instances. Currently, this API supports RAW, VHD, QCOW2, and VMDK image formats.
     * @param req ImportImageRequest
     * @return ImportImageResponse
     * @throws TencentCloudSDKException
     */
    public ImportImageResponse ImportImage(ImportImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportImage", ImportImageResponse.class);
    }

    /**
     *This API is used to import key pairs.

* You can use this API to import key pairs to a user account, but the key pairs will not be automatically associated with any instance. You may use [AssociasteInstancesKeyPair](https://intl.cloud.tencent.com/document/api/213/15698?from_cn_redirect=1) to associate key pairs with instances.
* You need to specify the names of the key pairs and the content of the public keys.
* If you only have private keys, you can convert them to public keys with the `SSL` tool before importing them.
     * @param req ImportKeyPairRequest
     * @return ImportKeyPairResponse
     * @throws TencentCloudSDKException
     */
    public ImportKeyPairResponse ImportKeyPair(ImportKeyPairRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportKeyPair", ImportKeyPairResponse.class);
    }

    /**
     *This API is used to query the price of reserved instances. It only supports querying purchasable reserved instance offerings. Currently, RIs are only offered to beta users.
     * @param req InquirePricePurchaseReservedInstancesOfferingRequest
     * @return InquirePricePurchaseReservedInstancesOfferingResponse
     * @throws TencentCloudSDKException
     */
    public InquirePricePurchaseReservedInstancesOfferingResponse InquirePricePurchaseReservedInstancesOffering(InquirePricePurchaseReservedInstancesOfferingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePricePurchaseReservedInstancesOffering", InquirePricePurchaseReservedInstancesOfferingResponse.class);
    }

    /**
     *This API is used to inquire about the price for reinstalling an instance.

* If you have specified the parameter `ImageId`, inquire about the price for reinstallation by using the specified image. Otherwise, inquire about the price for reinstallation based on the image currently used by the instance.
* Currently, only instances with a [system disk type](https://intl.cloud.tencent.com/document/api/213/15753?from_cn_redirect=1#SystemDisk) of `CLOUD_BSSD`, `CLOUD_PREMIUM`, or `CLOUD_SSD` are supported for inquiring about the price for reinstallation caused by switching between `Linux` and `Windows` operating systems through this API.
* Currently, instances in regions outside the Chinese mainland are not supported for inquiring about the price for reinstallation caused by switching between `Linux` and `Windows` operating systems through this API.
     * @param req InquiryPriceResetInstanceRequest
     * @return InquiryPriceResetInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceResetInstanceResponse InquiryPriceResetInstance(InquiryPriceResetInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceResetInstance", InquiryPriceResetInstanceResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceResetInstancesInternetMaxBandwidth", InquiryPriceResetInstancesInternetMaxBandwidthResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceResetInstancesType", InquiryPriceResetInstancesTypeResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceResizeInstanceDisks", InquiryPriceResizeInstanceDisksResponse.class);
    }

    /**
     *This API is used to query the price of creating instances. You can only use this API for instances whose configuration is within the purchase limit. For more information, see [RunInstances](https://intl.cloud.tencent.com/document/api/213/15730?from_cn_redirect=1).
     * @param req InquiryPriceRunInstancesRequest
     * @return InquiryPriceRunInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceRunInstancesResponse InquiryPriceRunInstances(InquiryPriceRunInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceRunInstances", InquiryPriceRunInstancesResponse.class);
    }

    /**
     *This API is used to modify the CHC host attributes.
     * @param req ModifyChcAttributeRequest
     * @return ModifyChcAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyChcAttributeResponse ModifyChcAttribute(ModifyChcAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyChcAttribute", ModifyChcAttributeResponse.class);
    }

    /**
     *This API is used to modify the attributes of [spread placement groups](https://intl.cloud.tencent.com/document/product/213/15486?from_cn_redirect=1).
     * @param req ModifyDisasterRecoverGroupAttributeRequest
     * @return ModifyDisasterRecoverGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDisasterRecoverGroupAttributeResponse ModifyDisasterRecoverGroupAttribute(ModifyDisasterRecoverGroupAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDisasterRecoverGroupAttribute", ModifyDisasterRecoverGroupAttributeResponse.class);
    }

    /**
     *This API is used to modify the attributes of a CDH instance, such as instance name and renewal flag. One of the two parameters, HostName and RenewFlag, must be set, but you cannot set both of them at the same time.
     * @param req ModifyHostsAttributeRequest
     * @return ModifyHostsAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHostsAttributeResponse ModifyHostsAttribute(ModifyHostsAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHostsAttribute", ModifyHostsAttributeResponse.class);
    }

    /**
     *This API is used to modify image attributes.

* Attributes of shared images cannot be modified.
     * @param req ModifyImageAttributeRequest
     * @return ModifyImageAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyImageAttributeResponse ModifyImageAttribute(ModifyImageAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyImageAttribute", ModifyImageAttributeResponse.class);
    }

    /**
     *This API is used to modify image sharing information.

* The account with shared image access can use the image to create instances.
* Each custom image can be shared with a maximum of 500 accounts.
* Shared images cannot have their names or description changed. They can only be used to create instances.
* Sharing is only supported within the same region as the recipient's account.
     * @param req ModifyImageSharePermissionRequest
     * @return ModifyImageSharePermissionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyImageSharePermissionResponse ModifyImageSharePermission(ModifyImageSharePermissionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyImageSharePermission", ModifyImageSharePermissionResponse.class);
    }

    /**
     *The API is used to modify the attributes of an instance. Only the name and the associated security groups can be modified for now.

* An attribute must be specified in the request.
* "Instance name" is a custom name for easier management. Tencent Cloud does not use the name for online support or instance management.
* Batch operations are supported. Each request can modify up to 100 instances.
* When you modify the security groups associated with an instance is modified, the original security groups are disassociated.
* You can use the API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1#.E7.A4.BA.E4.BE.8B3-.E6.9F.A5.E8.AF.A2.E5.AE.9E.E4.BE.8B.E7.9A.84.E6.9C.80.E6.96.B0.E6.93.8D.E4.BD.9C.E6.83.85.E5.86.B5) to query the instance operation result. If the 'LatestOperationState' in the response is **SUCCESS**, the operation is successful.
     * @param req ModifyInstancesAttributeRequest
     * @return ModifyInstancesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesAttributeResponse ModifyInstancesAttribute(ModifyInstancesAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstancesAttribute", ModifyInstancesAttributeResponse.class);
    }

    /**
     *This API is used to change the project to which an instance is assigned.

* Project is a virtual concept. You can create multiple projects under one account, manage different resources in each project, and assign different instances to different projects. You may use the [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) API to query instances and use the project ID to filter the results.
* You cannot modify the project of an instance that is bound to a load balancer. You need to unbind the load balancer from the instance by using the [DeregisterInstancesFromLoadBalancer](https://intl.cloud.tencent.com/document/api/214/1258?from_cn_redirect=1) API before using this API.
* Batch operations are supported. Up to 100 instances per request is allowed.
* You can use the API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1#.E7.A4.BA.E4.BE.8B3-.E6.9F.A5.E8.AF.A2.E5.AE.9E.E4.BE.8B.E7.9A.84.E6.9C.80.E6.96.B0.E6.93.8D.E4.BD.9C.E6.83.85.E5.86.B5) to query the operation result. If the `LatestOperationState` in the response is `SUCCESS`, the operation is successful.
     * @param req ModifyInstancesProjectRequest
     * @return ModifyInstancesProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesProjectResponse ModifyInstancesProject(ModifyInstancesProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstancesProject", ModifyInstancesProjectResponse.class);
    }

    /**
     *This API is used to modify the renewal flag of monthly subscription instances.

* After an instance is marked as auto-renewal, it will be automatically renewed for one month each time it expires.
* Batch operations are supported. The maximum number of instances for each request is 100.* You can query the result of the instance operation by calling the API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1#.E7.A4.BA.E4.BE.8B3-.E6.9F.A5.E8.AF.A2.E5.AE.9E.E4.BE.8B.E7.9A.84.E6.9C.80.E6.96.B0.E6.93.8D.E4.BD.9C.E6.83.85.E5.86.B5). If the latest operation status (LatestOperationState) of the instance is **SUCCESS**, the operation is successful.
     * @param req ModifyInstancesRenewFlagRequest
     * @return ModifyInstancesRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesRenewFlagResponse ModifyInstancesRenewFlag(ModifyInstancesRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstancesRenewFlag", ModifyInstancesRenewFlagResponse.class);
    }

    /**
     *This API is used to modify the VPC attributes of an instance, such as the VPC IP address.
* This action will shut down the instance, and restart it after the modification is completed.
* To migrate an instance to another VPC/subnet, specify the new VPC and subnet directly. Make sure that the instance to migrate is not bound to an [ENI](https://intl.cloud.tencent.com/document/product/576?from_cn_redirect=1) or [CLB](https://intl.cloud.tencent.com/document/product/214?from_cn_redirect=1) instances.
* You can use the API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1#.E7.A4.BA.E4.BE.8B3-.E6.9F.A5.E8.AF.A2.E5.AE.9E.E4.BE.8B.E7.9A.84.E6.9C.80.E6.96.B0.E6.93.8D.E4.BD.9C.E6.83.85.E5.86.B5) to query the operation result. If the `LatestOperationState` in the response is `SUCCESS`, the operation is successful.
     * @param req ModifyInstancesVpcAttributeRequest
     * @return ModifyInstancesVpcAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesVpcAttributeResponse ModifyInstancesVpcAttribute(ModifyInstancesVpcAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstancesVpcAttribute", ModifyInstancesVpcAttributeResponse.class);
    }

    /**
     *This API is used to modify attributes of a key pair.

* Modify the name and description information of the key pair specified by the key pair ID.
* The key pair name should not be the same as the name of an existing key pair.
* The key pair ID is the unique identifier of a key pair and cannot be modified.

* Either the key pair name or description information should be specified, and both can also be specified simultaneously.
     * @param req ModifyKeyPairAttributeRequest
     * @return ModifyKeyPairAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyKeyPairAttributeResponse ModifyKeyPairAttribute(ModifyKeyPairAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyKeyPairAttribute", ModifyKeyPairAttributeResponse.class);
    }

    /**
     *This API is used to modify the default version of the instance launch template.
     * @param req ModifyLaunchTemplateDefaultVersionRequest
     * @return ModifyLaunchTemplateDefaultVersionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLaunchTemplateDefaultVersionResponse ModifyLaunchTemplateDefaultVersion(ModifyLaunchTemplateDefaultVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLaunchTemplateDefaultVersion", ModifyLaunchTemplateDefaultVersionResponse.class);
    }

    /**
     *This API is used to purchase one or more specific Reserved Instances.
     * @param req PurchaseReservedInstancesOfferingRequest
     * @return PurchaseReservedInstancesOfferingResponse
     * @throws TencentCloudSDKException
     */
    public PurchaseReservedInstancesOfferingResponse PurchaseReservedInstancesOffering(PurchaseReservedInstancesOfferingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PurchaseReservedInstancesOffering", PurchaseReservedInstancesOfferingResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "RebootInstances", RebootInstancesResponse.class);
    }

    /**
     *This API is used to remove the out-of-band network and deployment network of a CHC host.
     * @param req RemoveChcAssistVpcRequest
     * @return RemoveChcAssistVpcResponse
     * @throws TencentCloudSDKException
     */
    public RemoveChcAssistVpcResponse RemoveChcAssistVpc(RemoveChcAssistVpcRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveChcAssistVpc", RemoveChcAssistVpcResponse.class);
    }

    /**
     *This API is used to remove the deployment network of a CHC host.
     * @param req RemoveChcDeployVpcRequest
     * @return RemoveChcDeployVpcResponse
     * @throws TencentCloudSDKException
     */
    public RemoveChcDeployVpcResponse RemoveChcDeployVpc(RemoveChcDeployVpcRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveChcDeployVpc", RemoveChcDeployVpcResponse.class);
    }

    /**
     *This API (ResetInstance) is used to reinstall the operating system on a specified instance.



* If you have specified the parameter `ImageId`, use the specified image for reinstallation. Otherwise, perform reinstallation based on the image currently used by the instance.
* The system disk will be formatted and reset. Ensure that there are no important files in the system disk.
* If you do not specify a password, a random password will be sent via Message Center.
* Currently, only instances with a [system disk type](https://intl.cloud.tencent.com/document/api/213/9452?from_cn_redirect=1#SystemDisk) of `CLOUD_BASIC`, `CLOUD_PREMIUM`, `CLOUD_SSD`, or `CLOUD_BSSD` are supported for implementing operating system switching through this API.
* You can query the result of the instance operation by calling the API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1#.E7.A4.BA.E4.BE.8B3-.E6.9F.A5.E8.AF.A2.E5.AE.9E.E4.BE.8B.E7.9A.84.E6.9C.80.E6.96.B0.E6.93.8D.E4.BD.9C.E6.83.85.E5.86.B5). If the latest operation status (LatestOperationState) of the instance is **SUCCESS**, the operation is successful.
     * @param req ResetInstanceRequest
     * @return ResetInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstanceResponse ResetInstance(ResetInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetInstance", ResetInstanceResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetInstancesInternetMaxBandwidth", ResetInstancesInternetMaxBandwidthResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetInstancesPassword", ResetInstancesPasswordResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetInstancesType", ResetInstancesTypeResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "ResizeInstanceDisks", ResizeInstanceDisksResponse.class);
    }

    /**
     *This API is used to create one or more instances with a specified configuration.

* After an instance is created successfully, it will start up automatically, and the [instance status](https://intl.cloud.tencent.com/document/api/213/9452?from_cn_redirect=1#instance_state) will become "Running".
* If you create a pay-as-you-go instance billed on an hourly basis, an amount equivalent to the hourly rate will be frozen. Make sure your account balance is sufficient before calling this API.
* The number of instances you can purchase through this API is subject to the [Quota for CVM Instances](https://intl.cloud.tencent.com/document/product/213/2664?from_cn_redirect=1). Instances created through this API and in the CVM console are counted toward the quota.
* This API is an async API. An instance ID list is returned after the creation request is sent. However, it does not mean the creation has been completed. The status of the instance will be `Creating` during the creation. You can use [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) to query the status of the instance. If the status changes from `Creating` to `Running`, it means that the instance has been created successfully.
     * @param req RunInstancesRequest
     * @return RunInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RunInstancesResponse RunInstances(RunInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunInstances", RunInstancesResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "StartInstances", StartInstancesResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "StopInstances", StopInstancesResponse.class);
    }

    /**
     *This API is used to synchronize custom images to other regions.

* This API only supports synchronizing one image per call.
* This API supports multiple synchronization regions.
* A single account can have a maximum of 500 custom images in each region.
     * @param req SyncImagesRequest
     * @return SyncImagesResponse
     * @throws TencentCloudSDKException
     */
    public SyncImagesResponse SyncImages(SyncImagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncImages", SyncImagesResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateInstances", TerminateInstancesResponse.class);
    }

}
