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
package com.tencentcloudapi.lighthouse.v20200324;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.lighthouse.v20200324.models.*;

public class LighthouseClient extends AbstractClient{
    private static String endpoint = "lighthouse.tencentcloudapi.com";
    private static String service = "lighthouse";
    private static String version = "2020-03-24";
    
    public LighthouseClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public LighthouseClient(Credential credential, String region, ClientProfile profile) {
        super(LighthouseClient.endpoint, LighthouseClient.version, credential, region, profile);
    }

    /**
     *This API is used to roll back the system disk snapshot of the specified instance.
<li>Only rollback to the original system disk is supported.</li>
<li>Only snapshots in `NORMAL` status can be used for rollback. To query the status of a snapshot, you can call the `DescribeSnapshots` API and see the `SnapshotState` field in the response.</li>
<li>When a snapshot is rolled back, the status of the instance must be `STOPPED` or `RUNNING`. You can call the `DescribeInstances` API to query the instance status. Instances in `RUNNING` status will be forcibly shut down before snapshot rollback.</li>
     * @param req ApplyInstanceSnapshotRequest
     * @return ApplyInstanceSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public ApplyInstanceSnapshotResponse ApplyInstanceSnapshot(ApplyInstanceSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyInstanceSnapshot", ApplyInstanceSnapshotResponse.class);
    }

    /**
     *This API is used to bind a user-specified key pair to an instance.
* Only instances on LINUX_UNIX in [RUNNING, STOPPED] status are supported. Instances in `RUNNING` status will be forcibly shut down before binding.
* If the public key of a key pair is written to the SSH configuration of the instance, you will be able to log in to the instance with the private key of the key pair.
* If the instance is already associated with a key, the old key will become invalid.
* If you currently use a password to log in, you will no longer be able to do so after you associate the instance with a key.
* Batch operations are supported. The maximum number of instances in each request is 100. If instances not available for the operation are selected, you will get an error code.
* This API is async. After the request is sent successfully, a `RequestId` will be returned. At this time, the operation is not completed immediately. The result of the instance operation can be queried by calling the `DescribeInstances` API. If the latest operation status (LatestOperationState) of the instance is `SUCCESS`, the operation is successful.
     * @param req AssociateInstancesKeyPairsRequest
     * @return AssociateInstancesKeyPairsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateInstancesKeyPairsResponse AssociateInstancesKeyPairs(AssociateInstancesKeyPairsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateInstancesKeyPairs", AssociateInstancesKeyPairsResponse.class);
    }

    /**
     *This API is used to associate a CCN instance.
     * @param req AttachCcnRequest
     * @return AttachCcnResponse
     * @throws TencentCloudSDKException
     */
    public AttachCcnResponse AttachCcn(AttachCcnRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachCcn", AttachCcnResponse.class);
    }

    /**
     *This API is used to attach one or more cloud disks.
     * @param req AttachDisksRequest
     * @return AttachDisksResponse
     * @throws TencentCloudSDKException
     */
    public AttachDisksResponse AttachDisks(AttachDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachDisks", AttachDisksResponse.class);
    }

    /**
     *This API is used to create an image.
     * @param req CreateBlueprintRequest
     * @return CreateBlueprintResponse
     * @throws TencentCloudSDKException
     */
    public CreateBlueprintResponse CreateBlueprint(CreateBlueprintRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBlueprint", CreateBlueprintResponse.class);
    }

    /**
     *This API is used to create one or more cloud disks.
     * @param req CreateDisksRequest
     * @return CreateDisksResponse
     * @throws TencentCloudSDKException
     */
    public CreateDisksResponse CreateDisks(CreateDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDisks", CreateDisksResponse.class);
    }

    /**
     *This API is used to add a firewall rule on an instance.


* `FirewallVersion` is the firewall version number. Every time you update the firewall rule version, it will be automatically increased by 1 to prevent the updated rule from expiring. If it is left empty, conflicts will not be considered.

In the `FirewallRules` parameter:
* Valid values of the `Protocol` field include `TCP`, `UDP`, `ICMP`, and `ALL`.
* For the `Port` field, you can enter only `ALL`, a single port number, several port numbers separated by commas, or a port range indicated by two port numbers separated by a minus sign. If `Port` is a range, the port number on the left of the minus sign must be smaller than the one on the right. If `Protocol` is not `TCP` or `UDP`, `Port` can only be empty or `ALL`. The length of the `Port` field cannot exceed 64 characters.
* For the `CidrBlock` field, you can enter any string that conforms to the CIDR format standard. Multi-Tenant network isolation rules take precedence over private network rules in the firewall.
* For the `Action` field, you can enter only `ACCEPT` or `DROP`.
* The length of the `FirewallRuleDescription` field cannot exceed 64 characters.
     * @param req CreateFirewallRulesRequest
     * @return CreateFirewallRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateFirewallRulesResponse CreateFirewallRules(CreateFirewallRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFirewallRules", CreateFirewallRulesResponse.class);
    }

    /**
     *This API is used to create a system disk snapshot of the specified instance.
     * @param req CreateInstanceSnapshotRequest
     * @return CreateInstanceSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceSnapshotResponse CreateInstanceSnapshot(CreateInstanceSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstanceSnapshot", CreateInstanceSnapshotResponse.class);
    }

    /**
     *This API is used to create one or more Lighthouse instances.
     * @param req CreateInstancesRequest
     * @return CreateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstancesResponse CreateInstances(CreateInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstances", CreateInstancesResponse.class);
    }

    /**
     *This API is used to create a key pair.
     * @param req CreateKeyPairRequest
     * @return CreateKeyPairResponse
     * @throws TencentCloudSDKException
     */
    public CreateKeyPairResponse CreateKeyPair(CreateKeyPairRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateKeyPair", CreateKeyPairResponse.class);
    }

    /**
     *This API is used to delete an image.
     * @param req DeleteBlueprintsRequest
     * @return DeleteBlueprintsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBlueprintsResponse DeleteBlueprints(DeleteBlueprintsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBlueprints", DeleteBlueprintsResponse.class);
    }

    /**
     *This API is used to delete a firewall rule of an instance.

* `FirewallVersion` is used to specify the version of the firewall to be manipulated. If the `FirewallVersion` value passed in is not equal to the current latest version of the firewall, a failure will be returned. If `FirewallVersion` is not passed in, the specified rule will be deleted directly.

In the `FirewallRules` parameter:
* Valid values of the `Protocol` field include `TCP`, `UDP`, `ICMP`, and `ALL`.
* For the `Port` field, you can enter only `ALL`, a single port number, several port numbers separated by commas, or a port range indicated by two port numbers separated by a minus sign. If `Port` is a range, the port number on the left of the minus sign must be smaller than the one on the right. If `Protocol` is not `TCP` or `UDP`, `Port` can only be empty or `ALL`. The length of the `Port` field cannot exceed 64 characters.
* For the `CidrBlock` field, you can enter any string that conforms to the CIDR format standard. Multi-Tenant network isolation rules take precedence over private network rules in the firewall.
* For the `Action` field, you can enter only `ACCEPT` or `DROP`.
* The length of the `FirewallRuleDescription` field cannot exceed 64 characters.
     * @param req DeleteFirewallRulesRequest
     * @return DeleteFirewallRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFirewallRulesResponse DeleteFirewallRules(DeleteFirewallRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFirewallRules", DeleteFirewallRulesResponse.class);
    }

    /**
     *This API is used to delete a key pair.
     * @param req DeleteKeyPairsRequest
     * @return DeleteKeyPairsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteKeyPairsResponse DeleteKeyPairs(DeleteKeyPairsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteKeyPairs", DeleteKeyPairsResponse.class);
    }

    /**
     *This API is used to delete a snapshot.
The snapshot must be in `NORMAL` status. To query the status of a snapshot, you can call the `DescribeSnapshots` API and see the `SnapshotState` field in the response.
     * @param req DeleteSnapshotsRequest
     * @return DeleteSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSnapshotsResponse DeleteSnapshots(DeleteSnapshotsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSnapshots", DeleteSnapshotsResponse.class);
    }

    /**
     *This API is used to query the list of scenes in all regions.
     * @param req DescribeAllScenesRequest
     * @return DescribeAllScenesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllScenesResponse DescribeAllScenes(DescribeAllScenesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllScenes", DescribeAllScenesResponse.class);
    }

    /**
     *This API is used to query the information of an image instance.
     * @param req DescribeBlueprintInstancesRequest
     * @return DescribeBlueprintInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlueprintInstancesResponse DescribeBlueprintInstances(DescribeBlueprintInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBlueprintInstances", DescribeBlueprintInstancesResponse.class);
    }

    /**
     *This API is used to query the information of an image.
     * @param req DescribeBlueprintsRequest
     * @return DescribeBlueprintsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlueprintsResponse DescribeBlueprints(DescribeBlueprintsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBlueprints", DescribeBlueprintsResponse.class);
    }

    /**
     *This API is used to query the discount information of a package.
     * @param req DescribeBundleDiscountRequest
     * @return DescribeBundleDiscountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBundleDiscountResponse DescribeBundleDiscount(DescribeBundleDiscountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBundleDiscount", DescribeBundleDiscountResponse.class);
    }

    /**
     *This API is used to query the information of a package.
     * @param req DescribeBundlesRequest
     * @return DescribeBundlesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBundlesResponse DescribeBundles(DescribeBundlesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBundles", DescribeBundlesResponse.class);
    }

    /**
     *This API is used to query the information of instances associated with CCN.
     * @param req DescribeCcnAttachedInstancesRequest
     * @return DescribeCcnAttachedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcnAttachedInstancesResponse DescribeCcnAttachedInstances(DescribeCcnAttachedInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCcnAttachedInstances", DescribeCcnAttachedInstancesResponse.class);
    }

    /**
     *This API is used to query the cloud disk configuration.
     * @param req DescribeDiskConfigsRequest
     * @return DescribeDiskConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiskConfigsResponse DescribeDiskConfigs(DescribeDiskConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDiskConfigs", DescribeDiskConfigsResponse.class);
    }

    /**
     *This API is used to query the discount information of a cloud disk.
     * @param req DescribeDiskDiscountRequest
     * @return DescribeDiskDiscountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiskDiscountResponse DescribeDiskDiscount(DescribeDiskDiscountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDiskDiscount", DescribeDiskDiscountResponse.class);
    }

    /**
     *This API is used to query the information of one or more cloud disks.
     * @param req DescribeDisksRequest
     * @return DescribeDisksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisksResponse DescribeDisks(DescribeDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDisks", DescribeDisksResponse.class);
    }

    /**
     *This API is used to query the list of operation limits of one or more cloud disks.
     * @param req DescribeDisksDeniedActionsRequest
     * @return DescribeDisksDeniedActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisksDeniedActionsResponse DescribeDisksDeniedActions(DescribeDisksDeniedActionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDisksDeniedActions", DescribeDisksDeniedActionsResponse.class);
    }

    /**
     *This API is used to query whether the specified cloud disk can be returned.
     * @param req DescribeDisksReturnableRequest
     * @return DescribeDisksReturnableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisksReturnableResponse DescribeDisksReturnable(DescribeDisksReturnableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDisksReturnable", DescribeDisksReturnableResponse.class);
    }

    /**
     *This API is used to query the firewall rules of an instance.
     * @param req DescribeFirewallRulesRequest
     * @return DescribeFirewallRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirewallRulesResponse DescribeFirewallRules(DescribeFirewallRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFirewallRules", DescribeFirewallRulesResponse.class);
    }

    /**
     *This API is used to query a firewall rule template.
     * @param req DescribeFirewallRulesTemplateRequest
     * @return DescribeFirewallRulesTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirewallRulesTemplateResponse DescribeFirewallRulesTemplate(DescribeFirewallRulesTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFirewallRulesTemplate", DescribeFirewallRulesTemplateResponse.class);
    }

    /**
     *This API is used to query the quota information of general resources.
     * @param req DescribeGeneralResourceQuotasRequest
     * @return DescribeGeneralResourceQuotasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGeneralResourceQuotasResponse DescribeGeneralResourceQuotas(DescribeGeneralResourceQuotasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGeneralResourceQuotas", DescribeGeneralResourceQuotasResponse.class);
    }

    /**
     *This API is used to query the attributes of the default login key of an instance.
     * @param req DescribeInstanceLoginKeyPairAttributeRequest
     * @return DescribeInstanceLoginKeyPairAttributeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLoginKeyPairAttributeResponse DescribeInstanceLoginKeyPairAttribute(DescribeInstanceLoginKeyPairAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceLoginKeyPairAttribute", DescribeInstanceLoginKeyPairAttributeResponse.class);
    }

    /**
     *This API is used to query the URL for VNC login.

* It does not support `STOPPED` CVMs.
* A VNC URL is only valid for 15 seconds. If you do not access the URL within 15 seconds, you will need to query another one.
* The VNC URL can be used once only. You need to query a new one if you want to log in again.
* Up to 30 re-connection attempts allowed in one minute.
* `InstanceVncUrl`: Its value will be returned after the API is successfully called.
After you get the value of `InstanceVncUrl`, you need to append `InstanceVncUrl=xxxx` to the end of the link `https://img.qcloud.com/qcloud/app/active_vnc/index.html?`.
 The final URL can be in the following formats:

```
https://img.qcloud.com/qcloud/app/active_vnc/index.html?InstanceVncUrl=wss%3A%2F%2Fbjvnc.qcloud.com%3A26789%2Fvnc%3Fs%3DaHpjWnRVMFNhYmxKdDM5MjRHNlVTSVQwajNUSW0wb2tBbmFtREFCTmFrcy8vUUNPMG0wSHZNOUUxRm5PMmUzWmFDcWlOdDJIbUJxSTZDL0RXcHZxYnZZMmRkWWZWcEZia2lyb09XMzdKNmM9
```

     * @param req DescribeInstanceVncUrlRequest
     * @return DescribeInstanceVncUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceVncUrlResponse DescribeInstanceVncUrl(DescribeInstanceVncUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceVncUrl", DescribeInstanceVncUrlResponse.class);
    }

    /**
     *This API is used to query the details of one or multiple instances.

* You can query the details of an instance according to its ID, name, or private IP.
* For more information on filters, please see [Filters](https://intl.cloud.tencent.com/document/product/1207/47576?from_cn_redirect=1#Filter).
* If no parameter is defined, the status of a certain number of instances under the current account will be returned. The number is specified by `Limit` and is 20 by default.
* The latest operation (LatestOperation) and the latest operation status (LatestOperationState) of the instance can be queried.
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *This API is used to query the list of operation limits of one or more instances.
     * @param req DescribeInstancesDeniedActionsRequest
     * @return DescribeInstancesDeniedActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesDeniedActionsResponse DescribeInstancesDeniedActions(DescribeInstancesDeniedActionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancesDeniedActions", DescribeInstancesDeniedActionsResponse.class);
    }

    /**
     *This API is used to query the number of cloud disks attached to instances.
     * @param req DescribeInstancesDiskNumRequest
     * @return DescribeInstancesDiskNumResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesDiskNumResponse DescribeInstancesDiskNum(DescribeInstancesDiskNumRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancesDiskNum", DescribeInstancesDiskNumResponse.class);
    }

    /**
     *This API is used to query whether the specified instance can be returned.
     * @param req DescribeInstancesReturnableRequest
     * @return DescribeInstancesReturnableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesReturnableResponse DescribeInstancesReturnable(DescribeInstancesReturnableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancesReturnable", DescribeInstancesReturnableResponse.class);
    }

    /**
     *This API is used to query the traffic package details of one or more instances.
     * @param req DescribeInstancesTrafficPackagesRequest
     * @return DescribeInstancesTrafficPackagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesTrafficPackagesResponse DescribeInstancesTrafficPackages(DescribeInstancesTrafficPackagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancesTrafficPackages", DescribeInstancesTrafficPackagesResponse.class);
    }

    /**
     *This API is used to query key pairs.
     * @param req DescribeKeyPairsRequest
     * @return DescribeKeyPairsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKeyPairsResponse DescribeKeyPairs(DescribeKeyPairsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKeyPairs", DescribeKeyPairsResponse.class);
    }

    /**
     *This API is used to query the list of package options of an instance.
     * @param req DescribeModifyInstanceBundlesRequest
     * @return DescribeModifyInstanceBundlesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModifyInstanceBundlesResponse DescribeModifyInstanceBundles(DescribeModifyInstanceBundlesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModifyInstanceBundles", DescribeModifyInstanceBundlesResponse.class);
    }

    /**
     *This API is used to query the information of regions.
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegions", DescribeRegionsResponse.class);
    }

    /**
     *This API is used to query the image information of a reset instance.
     * @param req DescribeResetInstanceBlueprintsRequest
     * @return DescribeResetInstanceBlueprintsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResetInstanceBlueprintsResponse DescribeResetInstanceBlueprints(DescribeResetInstanceBlueprintsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResetInstanceBlueprints", DescribeResetInstanceBlueprintsResponse.class);
    }

    /**
     *This API is used to query the list of scenes.
     * @param req DescribeScenesRequest
     * @return DescribeScenesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScenesResponse DescribeScenes(DescribeScenesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScenes", DescribeScenesResponse.class);
    }

    /**
     *This API is used to query the list of snapshots.
     * @param req DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotsResponse DescribeSnapshots(DescribeSnapshotsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSnapshots", DescribeSnapshotsResponse.class);
    }

    /**
     *This API is used to query the list of operation limits of one or more snapshots.
     * @param req DescribeSnapshotsDeniedActionsRequest
     * @return DescribeSnapshotsDeniedActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotsDeniedActionsResponse DescribeSnapshotsDeniedActions(DescribeSnapshotsDeniedActionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSnapshotsDeniedActions", DescribeSnapshotsDeniedActionsResponse.class);
    }

    /**
     *This API is used to query the list of AZs in a region.
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZones", DescribeZonesResponse.class);
    }

    /**
     *This API is used to disassociate with a CCN instance.
     * @param req DetachCcnRequest
     * @return DetachCcnResponse
     * @throws TencentCloudSDKException
     */
    public DetachCcnResponse DetachCcn(DetachCcnRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachCcn", DetachCcnResponse.class);
    }

    /**
     *This API is used to detach one or more cloud disks.
     * @param req DetachDisksRequest
     * @return DetachDisksResponse
     * @throws TencentCloudSDKException
     */
    public DetachDisksResponse DetachDisks(DetachDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachDisks", DetachDisksResponse.class);
    }

    /**
     *This API is used to unbind an instance from the specified key pair.

* Only instances on LINUX_UNIX in [RUNNING, STOPPED] status are supported. Instances in `RUNNING` status will be forcibly shut down before unbinding.
* After a key pair is unassociated from an instance, you can log in to the instance with password.
* If no password was set, you cannot log in to the instance with SSH after unbinding. You can call the ResetInstancesPassword API to set a login password.
* Batch operations are supported. The maximum number of instances in each request is 100.
* This API is async. After the request is sent successfully, a `RequestId` will be returned. At this time, the operation is not completed immediately. The result of the instance operation can be queried by calling the `DescribeInstances` API. If the latest operation status (LatestOperationState) of the instance is `SUCCESS`, the operation is successful.
     * @param req DisassociateInstancesKeyPairsRequest
     * @return DisassociateInstancesKeyPairsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateInstancesKeyPairsResponse DisassociateInstancesKeyPairs(DisassociateInstancesKeyPairsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateInstancesKeyPairs", DisassociateInstancesKeyPairsResponse.class);
    }

    /**
     *This API is used to import the specified key pair.
     * @param req ImportKeyPairRequest
     * @return ImportKeyPairResponse
     * @throws TencentCloudSDKException
     */
    public ImportKeyPairResponse ImportKeyPair(ImportKeyPairRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportKeyPair", ImportKeyPairResponse.class);
    }

    /**
     *This API is used to query the price of a created image.
     * @param req InquirePriceCreateBlueprintRequest
     * @return InquirePriceCreateBlueprintResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceCreateBlueprintResponse InquirePriceCreateBlueprint(InquirePriceCreateBlueprintRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceCreateBlueprint", InquirePriceCreateBlueprintResponse.class);
    }

    /**
     *This API is used to query the price of purchasing cloud disks.
     * @param req InquirePriceCreateDisksRequest
     * @return InquirePriceCreateDisksResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceCreateDisksResponse InquirePriceCreateDisks(InquirePriceCreateDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceCreateDisks", InquirePriceCreateDisksResponse.class);
    }

    /**
     *This API is used to query the price of a created instance.
     * @param req InquirePriceCreateInstancesRequest
     * @return InquirePriceCreateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceCreateInstancesResponse InquirePriceCreateInstances(InquirePriceCreateInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceCreateInstances", InquirePriceCreateInstancesResponse.class);
    }

    /**
     *This API is used to query the price of renewing cloud disks.
     * @param req InquirePriceRenewDisksRequest
     * @return InquirePriceRenewDisksResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceRenewDisksResponse InquirePriceRenewDisks(InquirePriceRenewDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceRenewDisks", InquirePriceRenewDisksResponse.class);
    }

    /**
     *This API is used to query the price of renewing one or more instances.
     * @param req InquirePriceRenewInstancesRequest
     * @return InquirePriceRenewInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceRenewInstancesResponse InquirePriceRenewInstances(InquirePriceRenewInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceRenewInstances", InquirePriceRenewInstancesResponse.class);
    }

    /**
     *This API is used to return one or more Lighthouse cloud disks.

You can only perform this operation on `UNATTACHED` disks.
After the successful call of the API, the cloud disk goes to the SHUTDOWN state.
Up to 20 instances are supported at one time. 
This API is async. After the request is sent, a `RequestId` is returned. At this time, the operation is not completed yet. To check the result, you need to call  [DescribeDisks](https://intl.cloud.tencent.com/document/product/1207/66093?from_cn_redirect=1). If the latest operation status (LatestOperationState) of the disk is `SUCCESS`, the operation is successful.
     * @param req IsolateDisksRequest
     * @return IsolateDisksResponse
     * @throws TencentCloudSDKException
     */
    public IsolateDisksResponse IsolateDisks(IsolateDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateDisks", IsolateDisksResponse.class);
    }

    /**
     *This API is used to return one or more Lighthouse instances. 
* Only `RUNNING` and `STOPPED` instances can be returned. 
* The instance status goes to `SHUTDOWN` after the API is called successfully. 
* Batch operations are supported. Up to 20 resources (including instances and data disks) can be returned in each request. 
* This API is async. After the request is sent successfully, a `RequestId` will be returned. At this time, the operation is not completed immediately. The result of the instance operation can be queried by calling the `DescribeInstances` API. If the latest operation status (LatestOperationState) of the instance is `SUCCESS`, the operation is successful.
     * @param req IsolateInstancesRequest
     * @return IsolateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public IsolateInstancesResponse IsolateInstances(IsolateInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateInstances", IsolateInstancesResponse.class);
    }

    /**
     *This API is used to modify an image attribute.
     * @param req ModifyBlueprintAttributeRequest
     * @return ModifyBlueprintAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBlueprintAttributeResponse ModifyBlueprintAttribute(ModifyBlueprintAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBlueprintAttribute", ModifyBlueprintAttributeResponse.class);
    }

    /**
     *This API is used to modify cloud disk attributes.
     * @param req ModifyDisksAttributeRequest
     * @return ModifyDisksAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDisksAttributeResponse ModifyDisksAttribute(ModifyDisksAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDisksAttribute", ModifyDisksAttributeResponse.class);
    }

    /**
     *This API is used to modify the configuration of auto-renewal of cloud disks.
     * @param req ModifyDisksRenewFlagRequest
     * @return ModifyDisksRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDisksRenewFlagResponse ModifyDisksRenewFlag(ModifyDisksRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDisksRenewFlag", ModifyDisksRenewFlagResponse.class);
    }

    /**
     *This API is used to modify the description of a single firewall rule.

* `FirewallVersion` is used to specify the version of the firewall to be manipulated. If the `FirewallVersion` value passed in is not equal to the current latest version of the firewall, a failure will be returned. If `FirewallVersion` is not passed in, the description of the specified rule will be modified directly.

In the `FirewallRule` parameter:
* Valid values of the `Protocol` field include `TCP`, `UDP`, `ICMP`, and `ALL`.
* For the `Port` field, you can enter only `ALL`, a single port number, several port numbers separated by commas, or a port range indicated by two port numbers separated by a minus sign. If `Port` is a range, the port number on the left of the minus sign must be smaller than the one on the right. If `Protocol` is not `TCP` or `UDP`, `Port` can only be empty or `ALL`. The length of the `Port` field cannot exceed 64 characters.
* For the `CidrBlock` field, you can enter any string that conforms to the CIDR format standard. Multi-Tenant network isolation rules take precedence over private network rules in the firewall.
* For the `Action` field, you can enter only `ACCEPT` or `DROP`.
* The length of the `FirewallRuleDescription` field cannot exceed 64 characters.
     * @param req ModifyFirewallRuleDescriptionRequest
     * @return ModifyFirewallRuleDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFirewallRuleDescriptionResponse ModifyFirewallRuleDescription(ModifyFirewallRuleDescriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFirewallRuleDescription", ModifyFirewallRuleDescriptionResponse.class);
    }

    /**
     *This API is used to reset the firewall rules of an instance.

This API deletes all firewall rules of the current instance first and then adds new rules.

* `FirewallVersion` is used to specify the version of the firewall to be manipulated. If the `FirewallVersion` value passed in is not equal to the current latest version of the firewall, a failure will be returned. If `FirewallVersion` is not passed in, the specified rule will be reset directly.

In the `FirewallRules` parameter:
* Valid values of the `Protocol` field include `TCP`, `UDP`, `ICMP`, and `ALL`.
* For the `Port` field, you can enter only `ALL`, a single port number, several port numbers separated by commas, or a port range indicated by two port numbers separated by a minus sign. If `Port` is a range, the port number on the left of the minus sign must be smaller than the one on the right. If `Protocol` is not `TCP` or `UDP`, `Port` can only be empty or `ALL`. The length of the `Port` field cannot exceed 64 characters.
* For the `CidrBlock` field, you can enter any string that conforms to the CIDR format standard. Multi-Tenant network isolation rules take precedence over private network rules in the firewall.
* For the `Action` field, you can enter only `ACCEPT` or `DROP`.
* The length of the `FirewallRuleDescription` field cannot exceed 64 characters.
     * @param req ModifyFirewallRulesRequest
     * @return ModifyFirewallRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFirewallRulesResponse ModifyFirewallRules(ModifyFirewallRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFirewallRules", ModifyFirewallRulesResponse.class);
    }

    /**
     *This API is used to modify an instance attribute. 
* The instance name is used only for users’ convenience. 
* Batch operations are supported. The maximum number of instances in each request is 100.
     * @param req ModifyInstancesAttributeRequest
     * @return ModifyInstancesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesAttributeResponse ModifyInstancesAttribute(ModifyInstancesAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstancesAttribute", ModifyInstancesAttributeResponse.class);
    }

    /**
     *This API is used change one or more Lighthouse instance bundles. 
* Only `RUNNING` and `STOPPED` instances can be changed. 
* Batch operations are supported. The maximum number of instances in each request is 30. 
* This API is async. After the request is sent successfully, a `RequestId` will be returned. At this time, the operation is not completed immediately. The result of the instance operation can be queried by calling the `DescribeInstances` API. If the latest operation status (LatestOperationState) of the instance is `SUCCESS`, the operation is successful.
     * @param req ModifyInstancesBundleRequest
     * @return ModifyInstancesBundleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesBundleResponse ModifyInstancesBundle(ModifyInstancesBundleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstancesBundle", ModifyInstancesBundleResponse.class);
    }

    /**
     *This API is used to set the attributes of the default login key pair of an instance.


     * @param req ModifyInstancesLoginKeyPairAttributeRequest
     * @return ModifyInstancesLoginKeyPairAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesLoginKeyPairAttributeResponse ModifyInstancesLoginKeyPairAttribute(ModifyInstancesLoginKeyPairAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstancesLoginKeyPairAttribute", ModifyInstancesLoginKeyPairAttributeResponse.class);
    }

    /**
     *This API is used to change the auto-renewal setting of monthly-subscribed instances. 

* Instances with auto-renewal enabled are automatically renewed on a monthly basis upon the expiration. 
* Batch operations are supported. Up to 100 instances per request is allowed.
     * @param req ModifyInstancesRenewFlagRequest
     * @return ModifyInstancesRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesRenewFlagResponse ModifyInstancesRenewFlag(ModifyInstancesRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstancesRenewFlag", ModifyInstancesRenewFlagResponse.class);
    }

    /**
     *This API is used to modify the attributes of a snapshot.
<li>The snapshot name is used only for users’ convenience.</li>
     * @param req ModifySnapshotAttributeRequest
     * @return ModifySnapshotAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySnapshotAttributeResponse ModifySnapshotAttribute(ModifySnapshotAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySnapshotAttribute", ModifySnapshotAttributeResponse.class);
    }

    /**
     *This API is used to restart instances.

* You can only perform this operation on instances whose status is `RUNNING`.
* The instance status will become `REBOOTING` when the API is called successfully and will become `RUNNING` when the instance is successfully restarted.
* Batch operations are supported. The maximum number of instances in each request is 100.
* This API is async. After the request is sent successfully, a `RequestId` will be returned. At this time, the operation is not completed immediately. The result of the instance operation can be queried by calling the `DescribeInstances` API. If the latest operation status (LatestOperationState) of the instance is `SUCCESS`, the operation is successful.
     * @param req RebootInstancesRequest
     * @return RebootInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RebootInstancesResponse RebootInstances(RebootInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RebootInstances", RebootInstancesResponse.class);
    }

    /**
     *This API is used to renew one or more Lighthouse cloud disks.

This operation can only be performed on data disks with the status of `ATTACHED`, `UNATTACHED` or `SHUTDOWN`.
Up to 50 cloud disks are supported at one time.
This API is async. After the request is sent, a `RequestId` is returned. At this time, the operation is not completed yet. To check the result, you need to call  [DescribeDisks](https://intl.cloud.tencent.com/document/product/1207/66093?from_cn_redirect=1). If the latest operation status (LatestOperationState) of the disk is `SUCCESS`, the operation is successful.
     * @param req RenewDisksRequest
     * @return RenewDisksResponse
     * @throws TencentCloudSDKException
     */
    public RenewDisksResponse RenewDisks(RenewDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewDisks", RenewDisksResponse.class);
    }

    /**
     *This API is used to renew one or more Lighthouse instances.
* You can only perform this operation on instances whose status is `RUNNING`, `STOPPED` and `SHUTDOWN`.
* Batch operations are supported. Up to 100 instances are supported in each request.
* This API is async. After the request is sent successfully, a `RequestId` will be returned. At this time, the operation is not completed immediately. The result of the instance operation can be queried by calling the `DescribeInstances` API. If the latest operation status (LatestOperationState) of the instance is `SUCCESS`, the operation is successful.
     * @param req RenewInstancesRequest
     * @return RenewInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RenewInstancesResponse RenewInstances(RenewInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewInstances", RenewInstancesResponse.class);
    }

    /**
     *This API is used to apply for association again after a CCN instance association application expires.
     * @param req ResetAttachCcnRequest
     * @return ResetAttachCcnResponse
     * @throws TencentCloudSDKException
     */
    public ResetAttachCcnResponse ResetAttachCcn(ResetAttachCcnRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetAttachCcn", ResetAttachCcnResponse.class);
    }

    /**
     *This API is used to reinstall the image on the specified instance.

* If you specify a `BlueprintId`, the specified image is used; otherwise, the image used by the current instance is used.
* The system disk will be formatted and reset. Therefore, make sure that no important files are stored on the system disk.
* Currently, this API does not support switching the operating system between `LINUX_UNIX` and `WINDOWS` for instances.
* This API is async. After the request is sent successfully, a `RequestId` will be returned. At this time, the operation is not completed immediately. The result of the instance operation can be queried by calling the `DescribeInstances` API. If the latest operation status (LatestOperationState) of the instance is `SUCCESS`, the operation is successful.
     * @param req ResetInstanceRequest
     * @return ResetInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstanceResponse ResetInstance(ResetInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetInstance", ResetInstanceResponse.class);
    }

    /**
     *This API is used to reset the password of the instance OS to a user-specified password.
* You can only use this API to modify the password of the admin account. The name of the admin account varies by OS (on Windows, it is `Administrator`; on Ubuntu, it is `ubuntu`; on other systems, it is `root`).
* Batch operations are supported. You can reset the passwords of multiple instances to the same one. The maximum number of instances in each request is 100.
* It’s recommended to shut down the instance first and then reset the password. If the instance is running, this API will try to shut it down normally. If the attempt fails, it will force to instance to shut down.
* This API is async. After the request is sent successfully, a `RequestId` will be returned. At this time, the operation is not completed immediately. The result of the instance operation can be queried by calling the `DescribeInstances` API. If the latest operation status (LatestOperationState) of the instance is `SUCCESS`, the operation is successful.
Note: Just like powering off a physical PC, a forced shutdown may cause data loss or the corruption of file system.
     * @param req ResetInstancesPasswordRequest
     * @return ResetInstancesPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstancesPasswordResponse ResetInstancesPassword(ResetInstancesPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetInstancesPassword", ResetInstancesPasswordResponse.class);
    }

    /**
     *This API is used to start one or more instances.

* You can only perform this operation on instances whose status is `STOPPED`.
* The instance status will become `STARTING` when the API is called successfully and will become `RUNNING` when the instance is successfully started.
* Batch operations are supported. The maximum number of instances in each request is 100.
* This API is async. After the request is sent successfully, a `RequestId` will be returned. At this time, the operation is not completed immediately. The result of the instance operation can be queried by calling the `DescribeInstances` API. If the latest operation status (LatestOperationState) of the instance is `SUCCESS`, the operation is successful.
     * @param req StartInstancesRequest
     * @return StartInstancesResponse
     * @throws TencentCloudSDKException
     */
    public StartInstancesResponse StartInstances(StartInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartInstances", StartInstancesResponse.class);
    }

    /**
     *This API is used to shut down one or more instances.
* You can only perform this operation on instances whose status is `RUNNING`.
* The instance status will become `STOPPING` when the API is called successfully and will become `STOPPED` when the instance is successfully shut down.
* Batch operations are supported. The maximum number of instances in each request is 100.
* This API is async. After the request is sent successfully, a `RequestId` will be returned. At this time, the operation is not completed immediately. The result of the instance operation can be queried by calling the `DescribeInstances` API. If the latest operation status (LatestOperationState) of the instance is `SUCCESS`, the operation is successful.
     * @param req StopInstancesRequest
     * @return StopInstancesResponse
     * @throws TencentCloudSDKException
     */
    public StopInstancesResponse StopInstances(StopInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopInstances", StopInstancesResponse.class);
    }

    /**
     *This API is used to terminate one or more cloud disk.
     * @param req TerminateDisksRequest
     * @return TerminateDisksResponse
     * @throws TencentCloudSDKException
     */
    public TerminateDisksResponse TerminateDisks(TerminateDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateDisks", TerminateDisksResponse.class);
    }

    /**
     *This API is used to terminate one or more instances.

* Instances in `SHUTDOWN` status can be terminated through this API and cannot be recovered.
* Batch operations are supported. The allowed maximum number of instances in each request is 100.
* This API is async. After the request is sent successfully, a `RequestId` will be returned. At this time, the operation is not completed immediately. The result of the instance operation can be queried by calling the `DescribeInstances` API. If the latest operation status (LatestOperationState) of the instance is `SUCCESS`, the operation is successful.
     * @param req TerminateInstancesRequest
     * @return TerminateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public TerminateInstancesResponse TerminateInstances(TerminateInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateInstances", TerminateInstancesResponse.class);
    }

}
