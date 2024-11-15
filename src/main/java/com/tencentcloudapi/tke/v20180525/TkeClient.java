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
package com.tencentcloudapi.tke.v20180525;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tke.v20180525.models.*;

public class TkeClient extends AbstractClient{
    private static String endpoint = "tke.tencentcloudapi.com";
    private static String service = "tke";
    private static String version = "2018-05-25";
    
    public TkeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TkeClient(Credential credential, String region, ClientProfile profile) {
        super(TkeClient.endpoint, TkeClient.version, credential, region, profile);
    }

    /**
     *This API can be called to acquire the ClusterRole tke:admin. By setting a CAM policy, you can grant permission of this API to a sub-account that has higher permission in CAM. In this way, this sub-account can call this API directly to acquire the admin role of a Kubernetes cluster.
     * @param req AcquireClusterAdminRoleRequest
     * @return AcquireClusterAdminRoleResponse
     * @throws TencentCloudSDKException
     */
    public AcquireClusterAdminRoleResponse AcquireClusterAdminRole(AcquireClusterAdminRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AcquireClusterAdminRole", AcquireClusterAdminRoleResponse.class);
    }

    /**
     *This API is used to add one or more existing instances to a cluster.
     * @param req AddExistedInstancesRequest
     * @return AddExistedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AddExistedInstancesResponse AddExistedInstances(AddExistedInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddExistedInstances", AddExistedInstancesResponse.class);
    }

    /**
     *This API is used to move nodes in a cluster to a node pool.
     * @param req AddNodeToNodePoolRequest
     * @return AddNodeToNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public AddNodeToNodePoolResponse AddNodeToNodePool(AddNodeToNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddNodeToNodePool", AddNodeToNodePoolResponse.class);
    }

    /**
     *This API is used to add subnets in the container network for a VPC-CNI cluster.
     * @param req AddVpcCniSubnetsRequest
     * @return AddVpcCniSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public AddVpcCniSubnetsResponse AddVpcCniSubnets(AddVpcCniSubnetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddVpcCniSubnets", AddVpcCniSubnetsResponse.class);
    }

    /**
     *This API is used to check if the CIDR block of a TKE Edge cluster conflicts with other CIDR blocks.
     * @param req CheckEdgeClusterCIDRRequest
     * @return CheckEdgeClusterCIDRResponse
     * @throws TencentCloudSDKException
     */
    public CheckEdgeClusterCIDRResponse CheckEdgeClusterCIDR(CheckEdgeClusterCIDRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckEdgeClusterCIDR", CheckEdgeClusterCIDRResponse.class);
    }

    /**
     *This API is used to query nodes eligible for an upgrade in the given node list.
     * @param req CheckInstancesUpgradeAbleRequest
     * @return CheckInstancesUpgradeAbleResponse
     * @throws TencentCloudSDKException
     */
    public CheckInstancesUpgradeAbleResponse CheckInstancesUpgradeAble(CheckInstancesUpgradeAbleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckInstancesUpgradeAble", CheckInstancesUpgradeAbleResponse.class);
    }

    /**
     *This API is used to create a backup repository. You can specify the storage type (such as COS), the bucket region and the name. Up to 100 repositories can be created. Note that the settings of this API apply globally. You only need to create one backup repository, and back up TKE clusters in different regions in it.
     * @param req CreateBackupStorageLocationRequest
     * @return CreateBackupStorageLocationResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupStorageLocationResponse CreateBackupStorageLocation(CreateBackupStorageLocationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBackupStorageLocation", CreateBackupStorageLocationResponse.class);
    }

    /**
     *This API is used to create log collection configuration.
     * @param req CreateCLSLogConfigRequest
     * @return CreateCLSLogConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateCLSLogConfigResponse CreateCLSLogConfig(CreateCLSLogConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCLSLogConfig", CreateCLSLogConfigResponse.class);
    }

    /**
     *This API is used to create a cluster.
     * @param req CreateClusterRequest
     * @return CreateClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterResponse CreateCluster(CreateClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCluster", CreateClusterResponse.class);
    }

    /**
     *This API is used to create a cluster access endpoint.
     * @param req CreateClusterEndpointRequest
     * @return CreateClusterEndpointResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterEndpointResponse CreateClusterEndpoint(CreateClusterEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterEndpoint", CreateClusterEndpointResponse.class);
    }

    /**
     *This API is used to create a public network access port for a managed cluster. Note: This API will be disused soon. Please call `CreateClusterEndpoint` instead.
     * @param req CreateClusterEndpointVipRequest
     * @return CreateClusterEndpointVipResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterEndpointVipResponse CreateClusterEndpointVip(CreateClusterEndpointVipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterEndpointVip", CreateClusterEndpointVipResponse.class);
    }

    /**
     *This API is used to create one or more nodes in a cluster.
     * @param req CreateClusterInstancesRequest
     * @return CreateClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterInstancesResponse CreateClusterInstances(CreateClusterInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterInstances", CreateClusterInstancesResponse.class);
    }

    /**
     *This API is used to create a node pool.
     * @param req CreateClusterNodePoolRequest
     * @return CreateClusterNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterNodePoolResponse CreateClusterNodePool(CreateClusterNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterNodePool", CreateClusterNodePoolResponse.class);
    }

    /**
     *This API is used to create a cluster route table.
     * @param req CreateClusterRouteTableRequest
     * @return CreateClusterRouteTableResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterRouteTableResponse CreateClusterRouteTable(CreateClusterRouteTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterRouteTable", CreateClusterRouteTableResponse.class);
    }

    /**
     *This API is used to create the Pay-as-you-go Super Node.
     * @param req CreateClusterVirtualNodeRequest
     * @return CreateClusterVirtualNodeResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterVirtualNodeResponse CreateClusterVirtualNode(CreateClusterVirtualNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterVirtualNode", CreateClusterVirtualNodeResponse.class);
    }

    /**
     *This API is used to create the Super Node Pool.
     * @param req CreateClusterVirtualNodePoolRequest
     * @return CreateClusterVirtualNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterVirtualNodePoolResponse CreateClusterVirtualNodePool(CreateClusterVirtualNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterVirtualNodePool", CreateClusterVirtualNodePoolResponse.class);
    }

    /**
     *This API is used to create an ECM instance.
     * @param req CreateECMInstancesRequest
     * @return CreateECMInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateECMInstancesResponse CreateECMInstances(CreateECMInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateECMInstances", CreateECMInstancesResponse.class);
    }

    /**
     *This API is used to create CVM instances in the specified TKE edge cluster.
     * @param req CreateEdgeCVMInstancesRequest
     * @return CreateEdgeCVMInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeCVMInstancesResponse CreateEdgeCVMInstances(CreateEdgeCVMInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEdgeCVMInstances", CreateEdgeCVMInstancesResponse.class);
    }

    /**
     *This API is used to create log collection configuration for a TKE Edge cluster.
     * @param req CreateEdgeLogConfigRequest
     * @return CreateEdgeLogConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeLogConfigResponse CreateEdgeLogConfig(CreateEdgeLogConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEdgeLogConfig", CreateEdgeLogConfigResponse.class);
    }

    /**
     *This API is used to create Log Collection Configuration for Elastic Cluster.
     * @param req CreateEksLogConfigRequest
     * @return CreateEksLogConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateEksLogConfigResponse CreateEksLogConfig(CreateEksLogConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEksLogConfig", CreateEksLogConfigResponse.class);
    }

    /**
     *This API is used to create an alarm rule.
     * @param req CreatePrometheusAlertRuleRequest
     * @return CreatePrometheusAlertRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusAlertRuleResponse CreatePrometheusAlertRule(CreatePrometheusAlertRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusAlertRule", CreatePrometheusAlertRuleResponse.class);
    }

    /**
     *This API is used to create a TKE Edge cluster.
     * @param req CreateTKEEdgeClusterRequest
     * @return CreateTKEEdgeClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateTKEEdgeClusterResponse CreateTKEEdgeCluster(CreateTKEEdgeClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTKEEdgeCluster", CreateTKEEdgeClusterResponse.class);
    }

    /**
     *This API is used to delete an add-on.
     * @param req DeleteAddonRequest
     * @return DeleteAddonResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAddonResponse DeleteAddon(DeleteAddonRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAddon", DeleteAddonResponse.class);
    }

    /**
     *This API is used to delete a backup repository.
     * @param req DeleteBackupStorageLocationRequest
     * @return DeleteBackupStorageLocationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBackupStorageLocationResponse DeleteBackupStorageLocation(DeleteBackupStorageLocationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBackupStorageLocation", DeleteBackupStorageLocationResponse.class);
    }

    /**
     *This API is used to delete a cluster. (Cloud API v3).
     * @param req DeleteClusterRequest
     * @return DeleteClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterResponse DeleteCluster(DeleteClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCluster", DeleteClusterResponse.class);
    }

    /**
     *Delete a cluster scaling group
     * @param req DeleteClusterAsGroupsRequest
     * @return DeleteClusterAsGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterAsGroupsResponse DeleteClusterAsGroups(DeleteClusterAsGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClusterAsGroups", DeleteClusterAsGroupsResponse.class);
    }

    /**
     *This API is used to delete a cluster access endpoint.
     * @param req DeleteClusterEndpointRequest
     * @return DeleteClusterEndpointResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterEndpointResponse DeleteClusterEndpoint(DeleteClusterEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClusterEndpoint", DeleteClusterEndpointResponse.class);
    }

    /**
     *Delete the external network access port of the managed cluster (the old way, only the external network port of the managed cluster is supported)
     * @param req DeleteClusterEndpointVipRequest
     * @return DeleteClusterEndpointVipResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterEndpointVipResponse DeleteClusterEndpointVip(DeleteClusterEndpointVipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClusterEndpointVip", DeleteClusterEndpointVipResponse.class);
    }

    /**
     *This API is used to delete one or more nodes from a cluster.
     * @param req DeleteClusterInstancesRequest
     * @return DeleteClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterInstancesResponse DeleteClusterInstances(DeleteClusterInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClusterInstances", DeleteClusterInstancesResponse.class);
    }

    /**
     *This API is used to delete a node pool.
     * @param req DeleteClusterNodePoolRequest
     * @return DeleteClusterNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterNodePoolResponse DeleteClusterNodePool(DeleteClusterNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClusterNodePool", DeleteClusterNodePoolResponse.class);
    }

    /**
     *This API is used to delete a cluster route.
     * @param req DeleteClusterRouteRequest
     * @return DeleteClusterRouteResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterRouteResponse DeleteClusterRoute(DeleteClusterRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClusterRoute", DeleteClusterRouteResponse.class);
    }

    /**
     *This API is used to delete cluster a route table.
     * @param req DeleteClusterRouteTableRequest
     * @return DeleteClusterRouteTableResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterRouteTableResponse DeleteClusterRouteTable(DeleteClusterRouteTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClusterRouteTable", DeleteClusterRouteTableResponse.class);
    }

    /**
     *This API is used to delete the super node.
     * @param req DeleteClusterVirtualNodeRequest
     * @return DeleteClusterVirtualNodeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterVirtualNodeResponse DeleteClusterVirtualNode(DeleteClusterVirtualNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClusterVirtualNode", DeleteClusterVirtualNodeResponse.class);
    }

    /**
     *This API is used to delete the Super Node Pool.
     * @param req DeleteClusterVirtualNodePoolRequest
     * @return DeleteClusterVirtualNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterVirtualNodePoolResponse DeleteClusterVirtualNodePool(DeleteClusterVirtualNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClusterVirtualNodePool", DeleteClusterVirtualNodePoolResponse.class);
    }

    /**
     *This API is used to delete one or more ECM instances.
     * @param req DeleteECMInstancesRequest
     * @return DeleteECMInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteECMInstancesResponse DeleteECMInstances(DeleteECMInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteECMInstances", DeleteECMInstancesResponse.class);
    }

    /**
     *This API is used to delete one or more edge CVM instances.
     * @param req DeleteEdgeCVMInstancesRequest
     * @return DeleteEdgeCVMInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeCVMInstancesResponse DeleteEdgeCVMInstances(DeleteEdgeCVMInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEdgeCVMInstances", DeleteEdgeCVMInstancesResponse.class);
    }

    /**
     *This API is used to delete one or more edge compute instances.
     * @param req DeleteEdgeClusterInstancesRequest
     * @return DeleteEdgeClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeClusterInstancesResponse DeleteEdgeClusterInstances(DeleteEdgeClusterInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEdgeClusterInstances", DeleteEdgeClusterInstancesResponse.class);
    }

    /**
     *This API is used to delete collection rules within the cluster.
     * @param req DeleteLogConfigsRequest
     * @return DeleteLogConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLogConfigsResponse DeleteLogConfigs(DeleteLogConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLogConfigs", DeleteLogConfigsResponse.class);
    }

    /**
     *This API is used to delete an alarm rule.
     * @param req DeletePrometheusAlertRuleRequest
     * @return DeletePrometheusAlertRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusAlertRuleResponse DeletePrometheusAlertRule(DeletePrometheusAlertRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusAlertRule", DeletePrometheusAlertRuleResponse.class);
    }

    /**
     *This API is used to delete a TKE Edge cluster.
     * @param req DeleteTKEEdgeClusterRequest
     * @return DeleteTKEEdgeClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTKEEdgeClusterResponse DeleteTKEEdgeCluster(DeleteTKEEdgeClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTKEEdgeCluster", DeleteTKEEdgeClusterResponse.class);
    }

    /**
     *This API is used to query the list of add-ons.
     * @param req DescribeAddonRequest
     * @return DescribeAddonResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddonResponse DescribeAddon(DescribeAddonRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAddon", DescribeAddonResponse.class);
    }

    /**
     *This API is used to query parameters of an add-on.
     * @param req DescribeAddonValuesRequest
     * @return DescribeAddonValuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddonValuesResponse DescribeAddonValues(DescribeAddonValuesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAddonValues", DescribeAddonValuesResponse.class);
    }

    /**
     *This API is used to obtain all versions that the cluster can upgrade to.
     * @param req DescribeAvailableClusterVersionRequest
     * @return DescribeAvailableClusterVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableClusterVersionResponse DescribeAvailableClusterVersion(DescribeAvailableClusterVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAvailableClusterVersion", DescribeAvailableClusterVersionResponse.class);
    }

    /**
     *This API is used to check the edge component versions and K8s versions supported by TKE Edge.
     * @param req DescribeAvailableTKEEdgeVersionRequest
     * @return DescribeAvailableTKEEdgeVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableTKEEdgeVersionResponse DescribeAvailableTKEEdgeVersion(DescribeAvailableTKEEdgeVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAvailableTKEEdgeVersion", DescribeAvailableTKEEdgeVersionResponse.class);
    }

    /**
     *This API is used to query backup repositories.
     * @param req DescribeBackupStorageLocationsRequest
     * @return DescribeBackupStorageLocationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupStorageLocationsResponse DescribeBackupStorageLocations(DescribeBackupStorageLocationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupStorageLocations", DescribeBackupStorageLocationsResponse.class);
    }

    /**
     *This API is used to query batch modification Tag status.
     * @param req DescribeBatchModifyTagsStatusRequest
     * @return DescribeBatchModifyTagsStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchModifyTagsStatusResponse DescribeBatchModifyTagsStatus(DescribeBatchModifyTagsStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBatchModifyTagsStatus", DescribeBatchModifyTagsStatusResponse.class);
    }

    /**
     *Cluster auto scaling configuration
     * @param req DescribeClusterAsGroupOptionRequest
     * @return DescribeClusterAsGroupOptionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterAsGroupOptionResponse DescribeClusterAsGroupOption(DescribeClusterAsGroupOptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterAsGroupOption", DescribeClusterAsGroupOptionResponse.class);
    }

    /**
     *Cluster-associated scaling group list
     * @param req DescribeClusterAsGroupsRequest
     * @return DescribeClusterAsGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterAsGroupsResponse DescribeClusterAsGroups(DescribeClusterAsGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterAsGroups", DescribeClusterAsGroupsResponse.class);
    }

    /**
     *This API is used to query cluster authentication configuration.
     * @param req DescribeClusterAuthenticationOptionsRequest
     * @return DescribeClusterAuthenticationOptionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterAuthenticationOptionsResponse DescribeClusterAuthenticationOptions(DescribeClusterAuthenticationOptionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterAuthenticationOptions", DescribeClusterAuthenticationOptionsResponse.class);
    }

    /**
     *This API is used to obtain the CommonName from the kube-apiserver client certificate that corresponding to the sub-account in RBAC authorization mode. 
     * @param req DescribeClusterCommonNamesRequest
     * @return DescribeClusterCommonNamesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterCommonNamesResponse DescribeClusterCommonNames(DescribeClusterCommonNamesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterCommonNames", DescribeClusterCommonNamesResponse.class);
    }

    /**
     *Query cluster access port status (intranet / extranet access is enabled for independent clusters, and intranet access is supported for managed clusters)
     * @param req DescribeClusterEndpointStatusRequest
     * @return DescribeClusterEndpointStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterEndpointStatusResponse DescribeClusterEndpointStatus(DescribeClusterEndpointStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterEndpointStatus", DescribeClusterEndpointStatusResponse.class);
    }

    /**
     *Query cluster open port process status (only supports external ports of the managed cluster)
     * @param req DescribeClusterEndpointVipStatusRequest
     * @return DescribeClusterEndpointVipStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterEndpointVipStatusResponse DescribeClusterEndpointVipStatus(DescribeClusterEndpointVipStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterEndpointVipStatus", DescribeClusterEndpointVipStatusResponse.class);
    }

    /**
     *This API is used to query cluster access addresses, including private network address, public network address, public network domain name, and security policy for public network access.
     * @param req DescribeClusterEndpointsRequest
     * @return DescribeClusterEndpointsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterEndpointsResponse DescribeClusterEndpoints(DescribeClusterEndpointsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterEndpoints", DescribeClusterEndpointsResponse.class);
    }

    /**
     *This API is used to query custom parameters of a cluster.
     * @param req DescribeClusterExtraArgsRequest
     * @return DescribeClusterExtraArgsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterExtraArgsResponse DescribeClusterExtraArgs(DescribeClusterExtraArgsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterExtraArgs", DescribeClusterExtraArgsResponse.class);
    }

    /**
     *This API is used to query information of node instances in a cluster.
     * @param req DescribeClusterInstancesRequest
     * @return DescribeClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterInstancesResponse DescribeClusterInstances(DescribeClusterInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterInstances", DescribeClusterInstancesResponse.class);
    }

    /**
     *This API is used to obtain the cluster kubeconfig file. Different sub-accounts have their own kubeconfig files. The kubeconfig file contains the kube-apiserver client certificate of the corresponding sub-account. By default, the client certificate is created when this API is called for the first time, and the certificate is valid for 20 years with no permissions granted. For the cluster owner or primary account, the cluster-admin permission is granted by default.
     * @param req DescribeClusterKubeconfigRequest
     * @return DescribeClusterKubeconfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterKubeconfigResponse DescribeClusterKubeconfig(DescribeClusterKubeconfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterKubeconfig", DescribeClusterKubeconfigResponse.class);
    }

    /**
     *This API is used to obtain the cluster model.
     * @param req DescribeClusterLevelAttributeRequest
     * @return DescribeClusterLevelAttributeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterLevelAttributeResponse DescribeClusterLevelAttribute(DescribeClusterLevelAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterLevelAttribute", DescribeClusterLevelAttributeResponse.class);
    }

    /**
     *This API is used to query the cluster model adjustment history.
     * @param req DescribeClusterLevelChangeRecordsRequest
     * @return DescribeClusterLevelChangeRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterLevelChangeRecordsResponse DescribeClusterLevelChangeRecords(DescribeClusterLevelChangeRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterLevelChangeRecords", DescribeClusterLevelChangeRecordsResponse.class);
    }

    /**
     *This API is used to query detailed information of a node pool.
     * @param req DescribeClusterNodePoolDetailRequest
     * @return DescribeClusterNodePoolDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterNodePoolDetailResponse DescribeClusterNodePoolDetail(DescribeClusterNodePoolDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterNodePoolDetail", DescribeClusterNodePoolDetailResponse.class);
    }

    /**
     *This API is used to query the node pool list
     * @param req DescribeClusterNodePoolsRequest
     * @return DescribeClusterNodePoolsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterNodePoolsResponse DescribeClusterNodePools(DescribeClusterNodePoolsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterNodePools", DescribeClusterNodePoolsResponse.class);
    }

    /**
     *This API is used to query one or more cluster route tables.
     * @param req DescribeClusterRouteTablesRequest
     * @return DescribeClusterRouteTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterRouteTablesResponse DescribeClusterRouteTables(DescribeClusterRouteTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterRouteTables", DescribeClusterRouteTablesResponse.class);
    }

    /**
     *This API is used to query cluster routes.
     * @param req DescribeClusterRoutesRequest
     * @return DescribeClusterRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterRoutesResponse DescribeClusterRoutes(DescribeClusterRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterRoutes", DescribeClusterRoutesResponse.class);
    }

    /**
     *This API is used to query the key information of a cluster.
     * @param req DescribeClusterSecurityRequest
     * @return DescribeClusterSecurityResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterSecurityResponse DescribeClusterSecurity(DescribeClusterSecurityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterSecurity", DescribeClusterSecurityResponse.class);
    }

    /**
     *This API is used to query the information of clusters under the current account.
     * @param req DescribeClusterStatusRequest
     * @return DescribeClusterStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterStatusResponse DescribeClusterStatus(DescribeClusterStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterStatus", DescribeClusterStatusResponse.class);
    }

    /**
     *This API is used to view the Super Node list.
     * @param req DescribeClusterVirtualNodeRequest
     * @return DescribeClusterVirtualNodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterVirtualNodeResponse DescribeClusterVirtualNode(DescribeClusterVirtualNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterVirtualNode", DescribeClusterVirtualNodeResponse.class);
    }

    /**
     *This API is used to view the Super Node Pool list.
     * @param req DescribeClusterVirtualNodePoolsRequest
     * @return DescribeClusterVirtualNodePoolsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterVirtualNodePoolsResponse DescribeClusterVirtualNodePools(DescribeClusterVirtualNodePoolsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterVirtualNodePools", DescribeClusterVirtualNodePoolsResponse.class);
    }

    /**
     *This API is used to query clusters list.
     * @param req DescribeClustersRequest
     * @return DescribeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClustersResponse DescribeClusters(DescribeClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusters", DescribeClustersResponse.class);
    }

    /**
     *This API is used to obtain the ECM instance information.
     * @param req DescribeECMInstancesRequest
     * @return DescribeECMInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeECMInstancesResponse DescribeECMInstances(DescribeECMInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeECMInstances", DescribeECMInstancesResponse.class);
    }

    /**
     *This API is used to query the custom parameters available for an edge cluster.
     * @param req DescribeEdgeAvailableExtraArgsRequest
     * @return DescribeEdgeAvailableExtraArgsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeAvailableExtraArgsResponse DescribeEdgeAvailableExtraArgs(DescribeEdgeAvailableExtraArgsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeAvailableExtraArgs", DescribeEdgeAvailableExtraArgsResponse.class);
    }

    /**
     *This API is used to obtain the edge CVM instance information.
     * @param req DescribeEdgeCVMInstancesRequest
     * @return DescribeEdgeCVMInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeCVMInstancesResponse DescribeEdgeCVMInstances(DescribeEdgeCVMInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeCVMInstances", DescribeEdgeCVMInstancesResponse.class);
    }

    /**
     *This API is used to query custom parameters of an edge cluster.
     * @param req DescribeEdgeClusterExtraArgsRequest
     * @return DescribeEdgeClusterExtraArgsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeClusterExtraArgsResponse DescribeEdgeClusterExtraArgs(DescribeEdgeClusterExtraArgsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeClusterExtraArgs", DescribeEdgeClusterExtraArgsResponse.class);
    }

    /**
     *This API is used to query the TKE Edge cluster node information.
     * @param req DescribeEdgeClusterInstancesRequest
     * @return DescribeEdgeClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeClusterInstancesResponse DescribeEdgeClusterInstances(DescribeEdgeClusterInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeClusterInstances", DescribeEdgeClusterInstancesResponse.class);
    }

    /**
     *This API is used to query the upgrade information of an edge cluster, including the upgradeable components, the current upgrade status, and errors occur during the upgrade.
     * @param req DescribeEdgeClusterUpgradeInfoRequest
     * @return DescribeEdgeClusterUpgradeInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeClusterUpgradeInfoResponse DescribeEdgeClusterUpgradeInfo(DescribeEdgeClusterUpgradeInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeClusterUpgradeInfo", DescribeEdgeClusterUpgradeInfoResponse.class);
    }

    /**
     *This API is used to query the status of event storage, cluster auditing and logging.
     * @param req DescribeEdgeLogSwitchesRequest
     * @return DescribeEdgeLogSwitchesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeLogSwitchesResponse DescribeEdgeLogSwitches(DescribeEdgeLogSwitchesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeLogSwitches", DescribeEdgeLogSwitchesResponse.class);
    }

    /**
     *This API is used to query the task progress of enabling VPC-CNI mode.
     * @param req DescribeEnableVpcCniProgressRequest
     * @return DescribeEnableVpcCniProgressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnableVpcCniProgressResponse DescribeEnableVpcCniProgress(DescribeEnableVpcCniProgressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnableVpcCniProgress", DescribeEnableVpcCniProgressResponse.class);
    }

    /**
     *This API is used to query the encryption status of etcd data.
     * @param req DescribeEncryptionStatusRequest
     * @return DescribeEncryptionStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEncryptionStatusResponse DescribeEncryptionStatus(DescribeEncryptionStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEncryptionStatus", DescribeEncryptionStatusResponse.class);
    }

    /**
     *This API is used to query one or more existing node and determine whether they can be added to a cluster.
     * @param req DescribeExistedInstancesRequest
     * @return DescribeExistedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExistedInstancesResponse DescribeExistedInstances(DescribeExistedInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExistedInstances", DescribeExistedInstancesResponse.class);
    }

    /**
     *This API is used to view third-party node pool configuration information.
     * @param req DescribeExternalNodeSupportConfigRequest
     * @return DescribeExternalNodeSupportConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExternalNodeSupportConfigResponse DescribeExternalNodeSupportConfig(DescribeExternalNodeSupportConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExternalNodeSupportConfig", DescribeExternalNodeSupportConfigResponse.class);
    }

    /**
     *This API is used to obtain eniipamd component information.
     * @param req DescribeIPAMDRequest
     * @return DescribeIPAMDResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIPAMDResponse DescribeIPAMD(DescribeIPAMDRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIPAMD", DescribeIPAMDResponse.class);
    }

    /**
     *This API is used to get image information.
     * @param req DescribeImagesRequest
     * @return DescribeImagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImagesResponse DescribeImages(DescribeImagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImages", DescribeImagesResponse.class);
    }

    /**
     *This API is used to query the log collection rules.
     * @param req DescribeLogConfigsRequest
     * @return DescribeLogConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogConfigsResponse DescribeLogConfigs(DescribeLogConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogConfigs", DescribeLogConfigsResponse.class);
    }

    /**
     *This API is used to query Cluster Log (Auditing, Event, Common Log) Switch List.
     * @param req DescribeLogSwitchesRequest
     * @return DescribeLogSwitchesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogSwitchesResponse DescribeLogSwitches(DescribeLogSwitchesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogSwitches", DescribeLogSwitchesResponse.class);
    }

    /**
     *This API is used to query the billing information of running Pods. You can query a specific Pod by Namespace and Name or batch query by Pod Uid.
     * @param req DescribePodChargeInfoRequest
     * @return DescribePodChargeInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribePodChargeInfoResponse DescribePodChargeInfo(DescribePodChargeInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePodChargeInfo", DescribePodChargeInfoResponse.class);
    }

    /**
     *This API is used to obtain the instance details.
     * @param req DescribePrometheusInstanceRequest
     * @return DescribePrometheusInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusInstanceResponse DescribePrometheusInstance(DescribePrometheusInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusInstance", DescribePrometheusInstanceResponse.class);
    }

    /**
     *This API is used to obtain all regions supported by TKE.
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegions", DescribeRegionsResponse.class);
    }

    /**
     *This API is used to query the usage rate of various types of Reserved Coupons.
     * @param req DescribeReservedInstanceUtilizationRateRequest
     * @return DescribeReservedInstanceUtilizationRateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReservedInstanceUtilizationRateResponse DescribeReservedInstanceUtilizationRate(DescribeReservedInstanceUtilizationRateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReservedInstanceUtilizationRate", DescribeReservedInstanceUtilizationRateResponse.class);
    }

    /**
     *This API is used to query the cluster resource usage.
     * @param req DescribeResourceUsageRequest
     * @return DescribeResourceUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceUsageResponse DescribeResourceUsage(DescribeResourceUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceUsage", DescribeResourceUsageResponse.class);
    }

    /**
     *This API is used to query the list of route table conflicts.
     * @param req DescribeRouteTableConflictsRequest
     * @return DescribeRouteTableConflictsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRouteTableConflictsResponse DescribeRouteTableConflicts(DescribeRouteTableConflictsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRouteTableConflicts", DescribeRouteTableConflictsResponse.class);
    }

    /**
     *This API is used to retrieve optional runtime versions based on K8S version.
     * @param req DescribeSupportedRuntimeRequest
     * @return DescribeSupportedRuntimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSupportedRuntimeResponse DescribeSupportedRuntime(DescribeSupportedRuntimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSupportedRuntime", DescribeSupportedRuntimeResponse.class);
    }

    /**
     *This API is used to obtain the authentication information of a TKE Edge cluster.
     * @param req DescribeTKEEdgeClusterCredentialRequest
     * @return DescribeTKEEdgeClusterCredentialResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTKEEdgeClusterCredentialResponse DescribeTKEEdgeClusterCredential(DescribeTKEEdgeClusterCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTKEEdgeClusterCredential", DescribeTKEEdgeClusterCredentialResponse.class);
    }

    /**
     *This API is used to query the current status and process information of a TKE Edge cluster.
     * @param req DescribeTKEEdgeClusterStatusRequest
     * @return DescribeTKEEdgeClusterStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTKEEdgeClusterStatusResponse DescribeTKEEdgeClusterStatus(DescribeTKEEdgeClusterStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTKEEdgeClusterStatus", DescribeTKEEdgeClusterStatusResponse.class);
    }

    /**
     *This API is used to query the list of TKE Edge clusters.
     * @param req DescribeTKEEdgeClustersRequest
     * @return DescribeTKEEdgeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTKEEdgeClustersResponse DescribeTKEEdgeClusters(DescribeTKEEdgeClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTKEEdgeClusters", DescribeTKEEdgeClustersResponse.class);
    }

    /**
     *This API is used to obtain the kubeconfig for access to a TKE Edge cluster through the public network.
     * @param req DescribeTKEEdgeExternalKubeconfigRequest
     * @return DescribeTKEEdgeExternalKubeconfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTKEEdgeExternalKubeconfigResponse DescribeTKEEdgeExternalKubeconfig(DescribeTKEEdgeExternalKubeconfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTKEEdgeExternalKubeconfig", DescribeTKEEdgeExternalKubeconfigResponse.class);
    }

    /**
     *This API is used to query the URL of TKE edge script. You can add external nodes to a TKE Edge cluster by downloading the URL.
     * @param req DescribeTKEEdgeScriptRequest
     * @return DescribeTKEEdgeScriptResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTKEEdgeScriptResponse DescribeTKEEdgeScript(DescribeTKEEdgeScriptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTKEEdgeScript", DescribeTKEEdgeScriptResponse.class);
    }

    /**
     *This API is used to query cluster version information.
     * @param req DescribeVersionsRequest
     * @return DescribeVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVersionsResponse DescribeVersions(DescribeVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVersions", DescribeVersionsResponse.class);
    }

    /**
     *This API is used to query the maximum number of Pods in the VPC-CNI network mode supported by the models in the specified availability zone of the current user and region.
     * @param req DescribeVpcCniPodLimitsRequest
     * @return DescribeVpcCniPodLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcCniPodLimitsResponse DescribeVpcCniPodLimits(DescribeVpcCniPodLimitsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpcCniPodLimits", DescribeVpcCniPodLimitsResponse.class);
    }

    /**
     *This API is used to disable cluster deletion protection.
     * @param req DisableClusterDeletionProtectionRequest
     * @return DisableClusterDeletionProtectionResponse
     * @throws TencentCloudSDKException
     */
    public DisableClusterDeletionProtectionResponse DisableClusterDeletionProtection(DisableClusterDeletionProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableClusterDeletionProtection", DisableClusterDeletionProtectionResponse.class);
    }

    /**
     *This API is used to disable encryption protection.
     * @param req DisableEncryptionProtectionRequest
     * @return DisableEncryptionProtectionResponse
     * @throws TencentCloudSDKException
     */
    public DisableEncryptionProtectionResponse DisableEncryptionProtection(DisableEncryptionProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableEncryptionProtection", DisableEncryptionProtectionResponse.class);
    }

    /**
     *This API is used to evict the Super Node.
     * @param req DrainClusterVirtualNodeRequest
     * @return DrainClusterVirtualNodeResponse
     * @throws TencentCloudSDKException
     */
    public DrainClusterVirtualNodeResponse DrainClusterVirtualNode(DrainClusterVirtualNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DrainClusterVirtualNode", DrainClusterVirtualNodeResponse.class);
    }

    /**
     *This API is used to enable cluster deletion protection.
     * @param req EnableClusterDeletionProtectionRequest
     * @return EnableClusterDeletionProtectionResponse
     * @throws TencentCloudSDKException
     */
    public EnableClusterDeletionProtectionResponse EnableClusterDeletionProtection(EnableClusterDeletionProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableClusterDeletionProtection", EnableClusterDeletionProtectionResponse.class);
    }

    /**
     *This API is used to enable Encrypted Data Protection, which requires enabling KMS capability and completing KMS authorization.
     * @param req EnableEncryptionProtectionRequest
     * @return EnableEncryptionProtectionResponse
     * @throws TencentCloudSDKException
     */
    public EnableEncryptionProtectionResponse EnableEncryptionProtection(EnableEncryptionProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableEncryptionProtection", EnableEncryptionProtectionResponse.class);
    }

    /**
     *This API is used to enable the VPC-CNI network mode for GR clusters.
     * @param req EnableVpcCniNetworkTypeRequest
     * @return EnableVpcCniNetworkTypeResponse
     * @throws TencentCloudSDKException
     */
    public EnableVpcCniNetworkTypeResponse EnableVpcCniNetworkType(EnableVpcCniNetworkTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableVpcCniNetworkType", EnableVpcCniNetworkTypeResponse.class);
    }

    /**
     *This API is used to work with the add-ons of a TKE Edge cluster.
     * @param req ForwardTKEEdgeApplicationRequestV3Request
     * @return ForwardTKEEdgeApplicationRequestV3Response
     * @throws TencentCloudSDKException
     */
    public ForwardTKEEdgeApplicationRequestV3Response ForwardTKEEdgeApplicationRequestV3(ForwardTKEEdgeApplicationRequestV3Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ForwardTKEEdgeApplicationRequestV3", ForwardTKEEdgeApplicationRequestV3Response.class);
    }

    /**
     *Obtaining the price of specified cluster model
     * @param req GetClusterLevelPriceRequest
     * @return GetClusterLevelPriceResponse
     * @throws TencentCloudSDKException
     */
    public GetClusterLevelPriceResponse GetClusterLevelPrice(GetClusterLevelPriceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetClusterLevelPrice", GetClusterLevelPriceResponse.class);
    }

    /**
     *This API is used to obtain the current progress of node upgrade. If the cluster is not in node upgrade status, the API will report an error: Task not found.
     * @param req GetUpgradeInstanceProgressRequest
     * @return GetUpgradeInstanceProgressResponse
     * @throws TencentCloudSDKException
     */
    public GetUpgradeInstanceProgressResponse GetUpgradeInstanceProgress(GetUpgradeInstanceProgressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetUpgradeInstanceProgress", GetUpgradeInstanceProgressResponse.class);
    }

    /**
     *This API is used to install an add-on on the target cluster.
     * @param req InstallAddonRequest
     * @return InstallAddonResponse
     * @throws TencentCloudSDKException
     */
    public InstallAddonResponse InstallAddon(InstallAddonRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InstallAddon", InstallAddonResponse.class);
    }

    /**
     *This API is used to install the log collection add-on on TKE Edge cluster nodes.
     * @param req InstallEdgeLogAgentRequest
     * @return InstallEdgeLogAgentResponse
     * @throws TencentCloudSDKException
     */
    public InstallEdgeLogAgentResponse InstallEdgeLogAgent(InstallEdgeLogAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InstallEdgeLogAgent", InstallEdgeLogAgentResponse.class);
    }

    /**
     *Modify cluster scaling group attributes
     * @param req ModifyClusterAsGroupAttributeRequest
     * @return ModifyClusterAsGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterAsGroupAttributeResponse ModifyClusterAsGroupAttribute(ModifyClusterAsGroupAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterAsGroupAttribute", ModifyClusterAsGroupAttributeResponse.class);
    }

    /**
     *This API is used to modify cluster auto scaling attributes.
     * @param req ModifyClusterAsGroupOptionAttributeRequest
     * @return ModifyClusterAsGroupOptionAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterAsGroupOptionAttributeResponse ModifyClusterAsGroupOptionAttribute(ModifyClusterAsGroupOptionAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterAsGroupOptionAttribute", ModifyClusterAsGroupOptionAttributeResponse.class);
    }

    /**
     *This API is used to modify cluster attributes.
     * @param req ModifyClusterAttributeRequest
     * @return ModifyClusterAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterAttributeResponse ModifyClusterAttribute(ModifyClusterAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterAttribute", ModifyClusterAttributeResponse.class);
    }

    /**
     *This API is used to modify cluster authentication configuration.
     * @param req ModifyClusterAuthenticationOptionsRequest
     * @return ModifyClusterAuthenticationOptionsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterAuthenticationOptionsResponse ModifyClusterAuthenticationOptions(ModifyClusterAuthenticationOptionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterAuthenticationOptions", ModifyClusterAuthenticationOptionsResponse.class);
    }

    /**
     *Modify the security policy of the external port of the managed cluster (the old way, only the external port of the managed cluster is supported)
     * @param req ModifyClusterEndpointSPRequest
     * @return ModifyClusterEndpointSPResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterEndpointSPResponse ModifyClusterEndpointSP(ModifyClusterEndpointSPRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterEndpointSP", ModifyClusterEndpointSPResponse.class);
    }

    /**
     *This API is used to modify the cluster image.
     * @param req ModifyClusterImageRequest
     * @return ModifyClusterImageResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterImageResponse ModifyClusterImage(ModifyClusterImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterImage", ModifyClusterImageResponse.class);
    }

    /**
     *This API is used to edit a node pool.
     * @param req ModifyClusterNodePoolRequest
     * @return ModifyClusterNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterNodePoolResponse ModifyClusterNodePool(ModifyClusterNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterNodePool", ModifyClusterNodePoolResponse.class);
    }

    /**
     *This API is used to modify the latitude runtime configuration of clusters and node pools.
     * @param req ModifyClusterRuntimeConfigRequest
     * @return ModifyClusterRuntimeConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterRuntimeConfigResponse ModifyClusterRuntimeConfig(ModifyClusterRuntimeConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterRuntimeConfig", ModifyClusterRuntimeConfigResponse.class);
    }

    /**
     *This API is used to modify cluster tags.
     * @param req ModifyClusterTagsRequest
     * @return ModifyClusterTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterTagsResponse ModifyClusterTags(ModifyClusterTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterTags", ModifyClusterTagsResponse.class);
    }

    /**
     *This API is used to modify the Super Node Pool.
     * @param req ModifyClusterVirtualNodePoolRequest
     * @return ModifyClusterVirtualNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterVirtualNodePoolResponse ModifyClusterVirtualNodePool(ModifyClusterVirtualNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterVirtualNodePool", ModifyClusterVirtualNodePoolResponse.class);
    }

    /**
     *This API is used to modify the model of instances in a node pool.
     * @param req ModifyNodePoolInstanceTypesRequest
     * @return ModifyNodePoolInstanceTypesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNodePoolInstanceTypesResponse ModifyNodePoolInstanceTypes(ModifyNodePoolInstanceTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNodePoolInstanceTypes", ModifyNodePoolInstanceTypesResponse.class);
    }

    /**
     *This API is used to modify an alert rule.
     * @param req ModifyPrometheusAlertRuleRequest
     * @return ModifyPrometheusAlertRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusAlertRuleResponse ModifyPrometheusAlertRule(ModifyPrometheusAlertRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrometheusAlertRule", ModifyPrometheusAlertRuleResponse.class);
    }

    /**
     *This API is used to remove a node from a node pool but retain it in the cluster.
     * @param req RemoveNodeFromNodePoolRequest
     * @return RemoveNodeFromNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public RemoveNodeFromNodePoolResponse RemoveNodeFromNodePool(RemoveNodeFromNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveNodeFromNodePool", RemoveNodeFromNodePoolResponse.class);
    }

    /**
     *This API is used to enable removal protection for the nodes automatically created by the scaling group in a node pool.
     * @param req SetNodePoolNodeProtectionRequest
     * @return SetNodePoolNodeProtectionResponse
     * @throws TencentCloudSDKException
     */
    public SetNodePoolNodeProtectionResponse SetNodePoolNodeProtection(SetNodePoolNodeProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetNodePoolNodeProtection", SetNodePoolNodeProtectionResponse.class);
    }

    /**
     *This API is used to uninstall the log collection add-on from TKE Edge cluster nodes.
     * @param req UninstallEdgeLogAgentRequest
     * @return UninstallEdgeLogAgentResponse
     * @throws TencentCloudSDKException
     */
    public UninstallEdgeLogAgentResponse UninstallEdgeLogAgent(UninstallEdgeLogAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UninstallEdgeLogAgent", UninstallEdgeLogAgentResponse.class);
    }

    /**
     *This API is used to update parameters and version of an add-on.
     * @param req UpdateAddonRequest
     * @return UpdateAddonResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAddonResponse UpdateAddon(UpdateAddonRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAddon", UpdateAddonResponse.class);
    }

    /**
     *This API is used to update the Kubeconfig information of a cluster.
     * @param req UpdateClusterKubeconfigRequest
     * @return UpdateClusterKubeconfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateClusterKubeconfigResponse UpdateClusterKubeconfig(UpdateClusterKubeconfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateClusterKubeconfig", UpdateClusterKubeconfigResponse.class);
    }

    /**
     *This API is used to upgrade the master component of the cluster to the specified version.
     * @param req UpdateClusterVersionRequest
     * @return UpdateClusterVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateClusterVersionResponse UpdateClusterVersion(UpdateClusterVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateClusterVersion", UpdateClusterVersionResponse.class);
    }

    /**
     *This API is used to upgrade an edge cluster component to a TKE Edge version.
     * @param req UpdateEdgeClusterVersionRequest
     * @return UpdateEdgeClusterVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateEdgeClusterVersionResponse UpdateEdgeClusterVersion(UpdateEdgeClusterVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateEdgeClusterVersion", UpdateEdgeClusterVersionResponse.class);
    }

    /**
     *This API is used to upgrade work nodes in a cluster.
     * @param req UpgradeClusterInstancesRequest
     * @return UpgradeClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeClusterInstancesResponse UpgradeClusterInstances(UpgradeClusterInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeClusterInstances", UpgradeClusterInstancesResponse.class);
    }

}
