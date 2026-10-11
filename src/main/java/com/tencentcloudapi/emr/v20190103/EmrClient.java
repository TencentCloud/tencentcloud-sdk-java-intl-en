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
package com.tencentcloudapi.emr.v20190103;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.emr.v20190103.models.*;

public class EmrClient extends AbstractClient{
    private static String endpoint = "emr.intl.tencentcloudapi.com";
    private static String service = "emr";
    private static String version = "2019-01-03";

    public EmrClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EmrClient(Credential credential, String region, ClientProfile profile) {
        super(EmrClient.endpoint, EmrClient.version, credential, region, profile);
    }

    /**
     *This API is used to add an automatic scaling rule by load and time.
     * @param req AddMetricScaleStrategyRequest
     * @return AddMetricScaleStrategyResponse
     * @throws TencentCloudSDKException
     */
    public AddMetricScaleStrategyResponse AddMetricScaleStrategy(AddMetricScaleStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddMetricScaleStrategy", AddMetricScaleStrategyResponse.class);
    }

    /**
     *This API is used to add node specifications for the current cluster.
     * @param req AddNodeResourceConfigRequest
     * @return AddNodeResourceConfigResponse
     * @throws TencentCloudSDKException
     */
    public AddNodeResourceConfigResponse AddNodeResourceConfig(AddNodeResourceConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddNodeResourceConfig", AddNodeResourceConfigResponse.class);
    }

    /**
     *This API is used for clusters with the OpenLDAP component installed.
This API is used to add a user list (user management).
     * @param req AddUsersForUserManagerRequest
     * @return AddUsersForUserManagerResponse
     * @throws TencentCloudSDKException
     */
    public AddUsersForUserManagerResponse AddUsersForUserManager(AddUsersForUserManagerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddUsersForUserManager", AddUsersForUserManagerResponse.class);
    }

    /**
     *This API is used to mount a cloud disk.
     * @param req AttachDisksRequest
     * @return AttachDisksResponse
     * @throws TencentCloudSDKException
     */
    public AttachDisksResponse AttachDisks(AttachDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachDisks", AttachDisksResponse.class);
    }

    /**
     *This API is used to convert a monthly subscription cluster to a pay-as-you-go cluster (excluding CDB).
     * @param req ConvertPreToPostClusterRequest
     * @return ConvertPreToPostClusterResponse
     * @throws TencentCloudSDKException
     */
    public ConvertPreToPostClusterResponse ConvertPreToPostCluster(ConvertPreToPostClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ConvertPreToPostCluster", ConvertPreToPostClusterResponse.class);
    }

    /**
     *This API is used to create an EMR cluster.
     * @param req CreateClusterRequest
     * @return CreateClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterResponse CreateCluster(CreateClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCluster", CreateClusterResponse.class);
    }

    /**
     *This API is used to create a DynamicInstance in a containerized EMR on TKE cluster.
     * @param req CreateDynamicInstanceRequest
     * @return CreateDynamicInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDynamicInstanceResponse CreateDynamicInstance(CreateDynamicInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDynamicInstance", CreateDynamicInstanceResponse.class);
    }

    /**
     *This API is used to create user groups in batches in user management.
     * @param req CreateGroupsSTDRequest
     * @return CreateGroupsSTDResponse
     * @throws TencentCloudSDKException
     */
    public CreateGroupsSTDResponse CreateGroupsSTD(CreateGroupsSTDRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGroupsSTD", CreateGroupsSTDResponse.class);
    }

    /**
     *This API is used to create an EMR cluster.
     * @param req CreateInstanceRequest
     * @return CreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceResponse CreateInstance(CreateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstance", CreateInstanceResponse.class);
    }

    /**
     *This API is used to create a Serverless instance, for example, HBase, StarRocks, and TCBase instances.- This API is successfully called, and a Serverless instance is created. If the instance creation request succeeds, InstanceId of the instance and RequestID of the request are returned.
- This is an asynchronous API. The operation is not completed immediately when the API call returns. The instance operation result can be viewed by calling the DescribeInstancesList API, and the StatusDesc field for the current instance can be returned.
     * @param req CreateSLInstanceRequest
     * @return CreateSLInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateSLInstanceResponse CreateSLInstance(CreateSLInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSLInstance", CreateSLInstanceResponse.class);
    }

    /**
     *This API is used to delete an automatic scaling rule. Nodes scaled based on this rule are terminated in the backend.
     * @param req DeleteAutoScaleStrategyRequest
     * @return DeleteAutoScaleStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAutoScaleStrategyResponse DeleteAutoScaleStrategy(DeleteAutoScaleStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAutoScaleStrategy", DeleteAutoScaleStrategyResponse.class);
    }

    /**
     *This API is used to delete user groups in batches.
     * @param req DeleteGroupsSTDRequest
     * @return DeleteGroupsSTDResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGroupsSTDResponse DeleteGroupsSTD(DeleteGroupsSTDRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGroupsSTD", DeleteGroupsSTDResponse.class);
    }

    /**
     *This API is used to delete node specifications of the current cluster.
     * @param req DeleteNodeResourceConfigRequest
     * @return DeleteNodeResourceConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNodeResourceConfigResponse DeleteNodeResourceConfig(DeleteNodeResourceConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNodeResourceConfig", DeleteNodeResourceConfigResponse.class);
    }

    /**
     *This API is used to bring the deployment into effect in YARN resource scheduling.
     * @param req DeployYarnConfRequest
     * @return DeployYarnConfResponse
     * @throws TencentCloudSDKException
     */
    public DeployYarnConfResponse DeployYarnConf(DeployYarnConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeployYarnConf", DeployYarnConfResponse.class);
    }

    /**
     *This API is used to obtain the global configuration of auto scaling.
     * @param req DescribeAutoScaleGroupGlobalConfRequest
     * @return DescribeAutoScaleGroupGlobalConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScaleGroupGlobalConfResponse DescribeAutoScaleGroupGlobalConf(DescribeAutoScaleGroupGlobalConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoScaleGroupGlobalConf", DescribeAutoScaleGroupGlobalConfResponse.class);
    }

    /**
     *This API is used to obtain the detailed automatic scaling records of a cluster.
     * @param req DescribeAutoScaleRecordsRequest
     * @return DescribeAutoScaleRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScaleRecordsResponse DescribeAutoScaleRecords(DescribeAutoScaleRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoScaleRecords", DescribeAutoScaleRecordsResponse.class);
    }

    /**
     *This API is used to obtain an automatic scaling rule.
     * @param req DescribeAutoScaleStrategiesRequest
     * @return DescribeAutoScaleStrategiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScaleStrategiesResponse DescribeAutoScaleStrategies(DescribeAutoScaleStrategiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoScaleStrategies", DescribeAutoScaleStrategiesResponse.class);
    }

    /**
     *This API is used to obtain a bootstrap script.
     * @param req DescribeBootScriptRequest
     * @return DescribeBootScriptResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBootScriptResponse DescribeBootScript(DescribeBootScriptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBootScript", DescribeBootScriptResponse.class);
    }

    /**
     *This API is used to query the running status details of an EMR cluster task.
     * @param req DescribeClusterFlowStatusDetailRequest
     * @return DescribeClusterFlowStatusDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterFlowStatusDetailResponse DescribeClusterFlowStatusDetail(DescribeClusterFlowStatusDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterFlowStatusDetail", DescribeClusterFlowStatusDetailResponse.class);
    }

    /**
     *This API is used to query information of a cluster node.
     * @param req DescribeClusterNodesRequest
     * @return DescribeClusterNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterNodesResponse DescribeClusterNodes(DescribeClusterNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterNodes", DescribeClusterNodesResponse.class);
    }

    /**
     *This API is used to query DAG information.
     * @param req DescribeDAGInfoRequest
     * @return DescribeDAGInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDAGInfoResponse DescribeDAGInfo(DescribeDAGInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDAGInfo", DescribeDAGInfoResponse.class);
    }

    /**
     *This API is used to describe the details of a DynamicInstance in an EMR on TKE cluster.
     * @param req DescribeDynamicInstanceDetailRequest
     * @return DescribeDynamicInstanceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDynamicInstanceDetailResponse DescribeDynamicInstanceDetail(DescribeDynamicInstanceDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDynamicInstanceDetail", DescribeDynamicInstanceDetailResponse.class);
    }

    /**
     *This API is used to describe the DynamicInstance list of an EMR on TKE cluster.
     * @param req DescribeDynamicInstanceListRequest
     * @return DescribeDynamicInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDynamicInstanceListResponse DescribeDynamicInstanceList(DescribeDynamicInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDynamicInstanceList", DescribeDynamicInstanceListResponse.class);
    }

    /**
     *This API is used to query EMR event monitoring data.
     * @param req DescribeEMREventListRequest
     * @return DescribeEMREventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEMREventListResponse DescribeEMREventList(DescribeEMREventListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEMREventList", DescribeEMREventListResponse.class);
    }

    /**
     *This API is used to query the YARN task statistics information.
     * @param req DescribeEmrApplicationStaticsRequest
     * @return DescribeEmrApplicationStaticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEmrApplicationStaticsResponse DescribeEmrApplicationStatics(DescribeEmrApplicationStaticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEmrApplicationStatics", DescribeEmrApplicationStaticsResponse.class);
    }

    /**
     *This API is used to query metric data on the monitoring overview page.
     * @param req DescribeEmrOverviewMetricsRequest
     * @return DescribeEmrOverviewMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEmrOverviewMetricsResponse DescribeEmrOverviewMetrics(DescribeEmrOverviewMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEmrOverviewMetrics", DescribeEmrOverviewMetricsResponse.class);
    }

    /**
     *This API is used to query the export configuration.
     * @param req DescribeExportConfsRequest
     * @return DescribeExportConfsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExportConfsResponse DescribeExportConfs(DescribeExportConfsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExportConfs", DescribeExportConfsResponse.class);
    }

    /**
     *This API is used to query the global configuration of YARN resource scheduling.
     * @param req DescribeGlobalConfigRequest
     * @return DescribeGlobalConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGlobalConfigResponse DescribeGlobalConfig(DescribeGlobalConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGlobalConfig", DescribeGlobalConfigResponse.class);
    }

    /**
     *This API is used to query a user group.
     * @param req DescribeGroupsSTDRequest
     * @return DescribeGroupsSTDResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupsSTDResponse DescribeGroupsSTD(DescribeGroupsSTDRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroupsSTD", DescribeGroupsSTDResponse.class);
    }

    /**
     *This API is used to obtain an overview of HBase table-level monitoring data.
     * @param req DescribeHBaseTableOverviewRequest
     * @return DescribeHBaseTableOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHBaseTableOverviewResponse DescribeHBaseTableOverview(DescribeHBaseTableOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHBaseTableOverview", DescribeHBaseTableOverviewResponse.class);
    }

    /**
     *This API is used to obtain the read/write rate at the HBase table level.
     * @param req DescribeHBaseTableRequestMetricRequest
     * @return DescribeHBaseTableRequestMetricResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHBaseTableRequestMetricResponse DescribeHBaseTableRequestMetric(DescribeHBaseTableRequestMetricRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHBaseTableRequestMetric", DescribeHBaseTableRequestMetricResponse.class);
    }

    /**
     *This API is used to query the StoreSize monitoring metric data at the HBase table level.
     * @param req DescribeHBaseTableStoreSizeMetricRequest
     * @return DescribeHBaseTableStoreSizeMetricResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHBaseTableStoreSizeMetricResponse DescribeHBaseTableStoreSizeMetric(DescribeHBaseTableStoreSizeMetricRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHBaseTableStoreSizeMetric", DescribeHBaseTableStoreSizeMetricResponse.class);
    }

    /**
     *This API is used to query information of files stored in HDFS.
     * @param req DescribeHDFSStorageInfoRequest
     * @return DescribeHDFSStorageInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHDFSStorageInfoResponse DescribeHDFSStorageInfo(DescribeHDFSStorageInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHDFSStorageInfo", DescribeHDFSStorageInfoResponse.class);
    }

    /**
     *This API is used to obtain Hive query information.
     * @param req DescribeHiveQueriesRequest
     * @return DescribeHiveQueriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHiveQueriesResponse DescribeHiveQueries(DescribeHiveQueriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHiveQueries", DescribeHiveQueriesResponse.class);
    }

    /**
     *This API is used to obtain insight result information.
     * @param req DescribeInsightListRequest
     * @return DescribeInsightListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInsightListResponse DescribeInsightList(DescribeInsightListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInsightList", DescribeInsightListResponse.class);
    }

    /**
     *This API is used to obtain the inspection task result list.
     * @param req DescribeInspectionTaskResultRequest
     * @return DescribeInspectionTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInspectionTaskResultResponse DescribeInspectionTaskResult(DescribeInspectionTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInspectionTaskResult", DescribeInspectionTaskResultResponse.class);
    }

    /**
     *This API is used to obtain the instance operation logs.
     * @param req DescribeInstanceOplogRequest
     * @return DescribeInstanceOplogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceOplogResponse DescribeInstanceOplog(DescribeInstanceOplogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceOplog", DescribeInstanceOplogResponse.class);
    }

    /**
     *This API is used to query cluster information.
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *This API is used to query the cluster list.
     * @param req DescribeInstancesListRequest
     * @return DescribeInstancesListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesListResponse DescribeInstancesList(DescribeInstancesListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancesList", DescribeInstancesListResponse.class);
    }

    /**
     *This API is used to obtain Kyuubi query information.
     * @param req DescribeKyuubiQueryInfoRequest
     * @return DescribeKyuubiQueryInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKyuubiQueryInfoResponse DescribeKyuubiQueryInfo(DescribeKyuubiQueryInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKyuubiQueryInfo", DescribeKyuubiQueryInfoResponse.class);
    }

    /**
     *This API is used to obtain cluster MetaDB data.
     * @param req DescribeMetaDBInfoRequest
     * @return DescribeMetaDBInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMetaDBInfoResponse DescribeMetaDBInfo(DescribeMetaDBInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMetaDBInfo", DescribeMetaDBInfoResponse.class);
    }

    /**
     *This API is used to query data disk information of a node.
     * @param req DescribeNodeDataDisksRequest
     * @return DescribeNodeDataDisksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNodeDataDisksResponse DescribeNodeDataDisks(DescribeNodeDataDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNodeDataDisks", DescribeNodeDataDisksResponse.class);
    }

    /**
     *This API is used to quickly obtain node specifications of the current cluster.
     * @param req DescribeNodeResourceConfigFastRequest
     * @return DescribeNodeResourceConfigFastResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNodeResourceConfigFastResponse DescribeNodeResourceConfigFast(DescribeNodeResourceConfigFastRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNodeResourceConfigFast", DescribeNodeResourceConfigFastResponse.class);
    }

    /**
     *This API is used to query node specifications.
     * @param req DescribeNodeSpecRequest
     * @return DescribeNodeSpecResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNodeSpecResponse DescribeNodeSpec(DescribeNodeSpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNodeSpec", DescribeNodeSpecResponse.class);
    }

    /**
     *This API is used to query YARN resource scheduling information. It has been deprecated. Please use `DescribeYarnQueue` to query queue information.
     * @param req DescribeResourceScheduleRequest
     * @return DescribeResourceScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceScheduleResponse DescribeResourceSchedule(DescribeResourceScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceSchedule", DescribeResourceScheduleResponse.class);
    }

    /**
     *This API is used to query the change details of YARN resource scheduling.
     * @param req DescribeResourceScheduleDiffDetailRequest
     * @return DescribeResourceScheduleDiffDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceScheduleDiffDetailResponse DescribeResourceScheduleDiffDetail(DescribeResourceScheduleDiffDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceScheduleDiffDetail", DescribeResourceScheduleDiffDetailResponse.class);
    }

    /**
     *This API is used to query basic information of a Serverless HBase instance.
     * @param req DescribeSLInstanceRequest
     * @return DescribeSLInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSLInstanceResponse DescribeSLInstance(DescribeSLInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSLInstance", DescribeSLInstanceResponse.class);
    }

    /**
     *This API is used to query detailed information of the Serverless HBase instance list.
     * @param req DescribeSLInstanceListRequest
     * @return DescribeSLInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSLInstanceListResponse DescribeSLInstanceList(DescribeSLInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSLInstanceList", DescribeSLInstanceListResponse.class);
    }

    /**
     *This API is used to describe service configuration group information.
     * @param req DescribeServiceConfGroupInfosRequest
     * @return DescribeServiceConfGroupInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceConfGroupInfosResponse DescribeServiceConfGroupInfos(DescribeServiceConfGroupInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServiceConfGroupInfos", DescribeServiceConfGroupInfosResponse.class);
    }

    /**
     *This API is used to query service process information.
     * @param req DescribeServiceNodeInfosRequest
     * @return DescribeServiceNodeInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceNodeInfosResponse DescribeServiceNodeInfos(DescribeServiceNodeInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServiceNodeInfos", DescribeServiceNodeInfosResponse.class);
    }

    /**
     *This API is used to obtain the Spark application list.
     * @param req DescribeSparkApplicationsRequest
     * @return DescribeSparkApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkApplicationsResponse DescribeSparkApplications(DescribeSparkApplicationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSparkApplications", DescribeSparkApplicationsResponse.class);
    }

    /**
     *This API is used to obtain the Spark query information list.
     * @param req DescribeSparkQueriesRequest
     * @return DescribeSparkQueriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkQueriesResponse DescribeSparkQueries(DescribeSparkQueriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSparkQueries", DescribeSparkQueriesResponse.class);
    }

    /**
     *This API is used to obtain StarRocks query information.
     * @param req DescribeStarRocksQueryInfoRequest
     * @return DescribeStarRocksQueryInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStarRocksQueryInfoResponse DescribeStarRocksQueryInfo(DescribeStarRocksQueryInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStarRocksQueryInfo", DescribeStarRocksQueryInfoResponse.class);
    }

    /**
     *This API is used to obtain Trino (PrestoSQL) query information.
     * @param req DescribeTrinoQueryInfoRequest
     * @return DescribeTrinoQueryInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrinoQueryInfoResponse DescribeTrinoQueryInfo(DescribeTrinoQueryInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrinoQueryInfo", DescribeTrinoQueryInfoResponse.class);
    }

    /**
     *This API is used for clusters with the OpenLDAP component installed.
This API is used to export users in batches. For a Kerberos cluster, if the keytab file download link is required, set NeedKeytabInfo to true. Note: If SupportDownLoadKeyTab is set to true but DownLoadKeyTabUrl is an empty string, the keytab file is not ready (being generated).
     * @param req DescribeUsersForUserManagerRequest
     * @return DescribeUsersForUserManagerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsersForUserManagerResponse DescribeUsersForUserManager(DescribeUsersForUserManagerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsersForUserManager", DescribeUsersForUserManagerResponse.class);
    }

    /**
     *This API is used to obtain queue information in resource scheduling.
     * @param req DescribeYarnQueueRequest
     * @return DescribeYarnQueueResponse
     * @throws TencentCloudSDKException
     */
    public DescribeYarnQueueResponse DescribeYarnQueue(DescribeYarnQueueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeYarnQueue", DescribeYarnQueueResponse.class);
    }

    /**
     *This API is used to view the YARN resource scheduling history. It has been deprecated. Please use Task Center to view the history records.
     * @param req DescribeYarnScheduleHistoryRequest
     * @return DescribeYarnScheduleHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeYarnScheduleHistoryResponse DescribeYarnScheduleHistory(DescribeYarnScheduleHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeYarnScheduleHistory", DescribeYarnScheduleHistoryResponse.class);
    }

    /**
     *This API is used to inquire the price for instance creation.
     * @param req InquiryPriceCreateInstanceRequest
     * @return InquiryPriceCreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateInstanceResponse InquiryPriceCreateInstance(InquiryPriceCreateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceCreateInstance", InquiryPriceCreateInstanceResponse.class);
    }

    /**
     *This API is used to inquire the price for renewal.
     * @param req InquiryPriceRenewInstanceRequest
     * @return InquiryPriceRenewInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceRenewInstanceResponse InquiryPriceRenewInstance(InquiryPriceRenewInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceRenewInstance", InquiryPriceRenewInstanceResponse.class);
    }

    /**
     *This API is used to inquire the price for a scale-out.
     * @param req InquiryPriceScaleOutInstanceRequest
     * @return InquiryPriceScaleOutInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceScaleOutInstanceResponse InquiryPriceScaleOutInstance(InquiryPriceScaleOutInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceScaleOutInstance", InquiryPriceScaleOutInstanceResponse.class);
    }

    /**
     *This API is used to inquire the price for the configuration change.
     * @param req InquiryPriceUpdateInstanceRequest
     * @return InquiryPriceUpdateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceUpdateInstanceResponse InquiryPriceUpdateInstance(InquiryPriceUpdateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceUpdateInstance", InquiryPriceUpdateInstanceResponse.class);
    }

    /**
     *This API is used to install a component. For components dependent on the MetaDB, a CDB order may be required. The components that can be installed on the current cluster and the components that might require a CDB order can be viewed via InstallSoftWareInfo.
     * @param req InstallSoftwareRequest
     * @return InstallSoftwareResponse
     * @throws TencentCloudSDKException
     */
    public InstallSoftwareResponse InstallSoftware(InstallSoftwareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InstallSoftware", InstallSoftwareResponse.class);
    }

    /**
     *This API is used to introduce the prerequisites for a prepaid cluster.
This API is used to enable or disable auto-renewal at the resource level.
     * @param req ModifyAutoRenewFlagRequest
     * @return ModifyAutoRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoRenewFlagResponse ModifyAutoRenewFlag(ModifyAutoRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoRenewFlag", ModifyAutoRenewFlagResponse.class);
    }

    /**
     *This API is used to modify an automatic scaling rule.
     * @param req ModifyAutoScaleStrategyRequest
     * @return ModifyAutoScaleStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoScaleStrategyResponse ModifyAutoScaleStrategy(ModifyAutoScaleStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoScaleStrategy", ModifyAutoScaleStrategyResponse.class);
    }

    /**
     *This API is used to modify a bootstrap script.
     * @param req ModifyBootScriptRequest
     * @return ModifyBootScriptResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBootScriptResponse ModifyBootScript(ModifyBootScriptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBootScript", ModifyBootScriptResponse.class);
    }

    /**
     *This API is used to update a DynamicInstance in a containerized EMR on TKE cluster.
     * @param req ModifyDynamicInstanceRequest
     * @return ModifyDynamicInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDynamicInstanceResponse ModifyDynamicInstance(ModifyDynamicInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDynamicInstance", ModifyDynamicInstanceResponse.class);
    }

    /**
     *This API is used to modify the global configuration of YARN resource scheduling.
     * @param req ModifyGlobalConfigRequest
     * @return ModifyGlobalConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGlobalConfigResponse ModifyGlobalConfig(ModifyGlobalConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGlobalConfig", ModifyGlobalConfigResponse.class);
    }

    /**
     *This API is used to set the inspection task configuration.
     * @param req ModifyInspectionSettingsRequest
     * @return ModifyInspectionSettingsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInspectionSettingsResponse ModifyInspectionSettings(ModifyInspectionSettingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInspectionSettings", ModifyInspectionSettingsResponse.class);
    }

    /**
     *This API is used to modify the cluster name.
     * @param req ModifyInstanceBasicRequest
     * @return ModifyInstanceBasicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceBasicResponse ModifyInstanceBasic(ModifyInstanceBasicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceBasic", ModifyInstanceBasicResponse.class);
    }

    /**
     *This API is used to change the instance configuration.
     * @param req ModifyResourceRequest
     * @return ModifyResourceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourceResponse ModifyResource(ModifyResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyResource", ModifyResourceResponse.class);
    }

    /**
     *This API is deprecated. Use ModifyYarnQueueV2 to modify queue configuration. No related logs exist in the past one year.

This API is used to modify the resource configuration of YARN Resource Scheduling. It has been deprecated. Use the ModifyYarnQueueV2 API to modify the queue configuration.
     * @param req ModifyResourceScheduleConfigRequest
     * @return ModifyResourceScheduleConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourceScheduleConfigResponse ModifyResourceScheduleConfig(ModifyResourceScheduleConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyResourceScheduleConfig", ModifyResourceScheduleConfigResponse.class);
    }

    /**
     *This API is used to modify a YARN resource scheduler. After the modification, click Deploy to make the modification take effect.
     * @param req ModifyResourceSchedulerRequest
     * @return ModifyResourceSchedulerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourceSchedulerResponse ModifyResourceScheduler(ModifyResourceSchedulerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyResourceScheduler", ModifyResourceSchedulerResponse.class);
    }

    /**
     *This API is used to forcibly modify a tag.
     * @param req ModifyResourcesTagsRequest
     * @return ModifyResourcesTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourcesTagsResponse ModifyResourcesTags(ModifyResourcesTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyResourcesTags", ModifyResourcesTagsResponse.class);
    }

    /**
     *This API is used to change the configuration of a Serverless HBase instance.
- This API is successfully called, and a Serverless HBase instance is created. If the instance creation request succeeds, RequestID of the request is returned.
- This is an asynchronous API. The operation is not completed immediately when the API call returns. The instance operation result can be viewed by calling the DescribeInstancesList API, and the StatusDesc field for the current instance can be returned.
     * @param req ModifySLInstanceRequest
     * @return ModifySLInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifySLInstanceResponse ModifySLInstance(ModifySLInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySLInstance", ModifySLInstanceResponse.class);
    }

    /**
     *This API is used to modify the Serverless HBase instance name.
     * @param req ModifySLInstanceBasicRequest
     * @return ModifySLInstanceBasicResponse
     * @throws TencentCloudSDKException
     */
    public ModifySLInstanceBasicResponse ModifySLInstanceBasic(ModifySLInstanceBasicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySLInstanceBasic", ModifySLInstanceBasicResponse.class);
    }

    /**
     *Configuration import and delivery
     * @param req ModifyServiceParamsByExportConfsRequest
     * @return ModifyServiceParamsByExportConfsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceParamsByExportConfsResponse ModifyServiceParamsByExportConfs(ModifyServiceParamsByExportConfsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyServiceParamsByExportConfs", ModifyServiceParamsByExportConfsResponse.class);
    }

    /**
     *This API is used to modify a user group in user management.
     * @param req ModifyUserGroupRequest
     * @return ModifyUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserGroupResponse ModifyUserGroup(ModifyUserGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserGroup", ModifyUserGroupResponse.class);
    }

    /**
     *This API is used to modify a user password (user management).
     * @param req ModifyUserManagerPwdRequest
     * @return ModifyUserManagerPwdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserManagerPwdResponse ModifyUserManagerPwd(ModifyUserManagerPwdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserManagerPwd", ModifyUserManagerPwdResponse.class);
    }

    /**
     *This API is used to change user information in a user group.
     * @param req ModifyUsersOfGroupSTDRequest
     * @return ModifyUsersOfGroupSTDResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUsersOfGroupSTDResponse ModifyUsersOfGroupSTD(ModifyUsersOfGroupSTDRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUsersOfGroupSTD", ModifyUsersOfGroupSTDResponse.class);
    }

    /**
     *This API is deprecated. Use DeployYarnConf to bring configurations into effect after deployment.

This API is used to bring configurations into effect after deployment. It has been deprecated. Use the DeployYarnConf API to bring configurations into effect after deployment.
     * @param req ModifyYarnDeployRequest
     * @return ModifyYarnDeployResponse
     * @throws TencentCloudSDKException
     */
    public ModifyYarnDeployResponse ModifyYarnDeploy(ModifyYarnDeployRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyYarnDeploy", ModifyYarnDeployResponse.class);
    }

    /**
     *This API is used to modify queue information in resource scheduling.
     * @param req ModifyYarnQueueV2Request
     * @return ModifyYarnQueueV2Response
     * @throws TencentCloudSDKException
     */
    public ModifyYarnQueueV2Response ModifyYarnQueueV2(ModifyYarnQueueV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyYarnQueueV2", ModifyYarnQueueV2Response.class);
    }

    /**
     *This API is used to modify the resource configuration of YARN resource scheduling.
     * @param req ResetYarnConfigRequest
     * @return ResetYarnConfigResponse
     * @throws TencentCloudSDKException
     */
    public ResetYarnConfigResponse ResetYarnConfig(ResetYarnConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetYarnConfig", ResetYarnConfigResponse.class);
    }

    /**
     *This API is used to scale out cloud data disks.
     * @param req ResizeDataDisksRequest
     * @return ResizeDataDisksResponse
     * @throws TencentCloudSDKException
     */
    public ResizeDataDisksResponse ResizeDataDisks(ResizeDataDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResizeDataDisks", ResizeDataDisksResponse.class);
    }

    /**
     *This API is used to scale out cluster nodes.
     * @param req ScaleOutClusterRequest
     * @return ScaleOutClusterResponse
     * @throws TencentCloudSDKException
     */
    public ScaleOutClusterResponse ScaleOutCluster(ScaleOutClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleOutCluster", ScaleOutClusterResponse.class);
    }

    /**
     *This API is used to scale out nodes.
     * @param req ScaleOutInstanceRequest
     * @return ScaleOutInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ScaleOutInstanceResponse ScaleOutInstance(ScaleOutInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleOutInstance", ScaleOutInstanceResponse.class);
    }

    /**
     *This API is used to set specifications of a node in the current cluster as the default or cancel the default setting.
     * @param req SetNodeResourceConfigDefaultRequest
     * @return SetNodeResourceConfigDefaultResponse
     * @throws TencentCloudSDKException
     */
    public SetNodeResourceConfigDefaultResponse SetNodeResourceConfigDefault(SetNodeResourceConfigDefaultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetNodeResourceConfigDefault", SetNodeResourceConfigDefaultResponse.class);
    }

    /**
     *This API is used to execute operations such as starting, stopping, and restarting a service.
     * @param req StartStopServiceOrMonitorRequest
     * @return StartStopServiceOrMonitorResponse
     * @throws TencentCloudSDKException
     */
    public StartStopServiceOrMonitorResponse StartStopServiceOrMonitor(StartStopServiceOrMonitorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartStopServiceOrMonitor", StartStopServiceOrMonitorResponse.class);
    }

    /**
     *This API is used to terminate a cluster node.
     * @param req TerminateClusterNodesRequest
     * @return TerminateClusterNodesResponse
     * @throws TencentCloudSDKException
     */
    public TerminateClusterNodesResponse TerminateClusterNodes(TerminateClusterNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateClusterNodes", TerminateClusterNodesResponse.class);
    }

    /**
     *This API is used to terminate a DynamicInstance in a containerized EMR on TKE cluster.
     * @param req TerminateDynamicInstancesRequest
     * @return TerminateDynamicInstancesResponse
     * @throws TencentCloudSDKException
     */
    public TerminateDynamicInstancesResponse TerminateDynamicInstances(TerminateDynamicInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateDynamicInstances", TerminateDynamicInstancesResponse.class);
    }

    /**
     *This API is used to terminate an EMR instance. It is supported only for the officially billed version of EMR.
     * @param req TerminateInstanceRequest
     * @return TerminateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public TerminateInstanceResponse TerminateInstance(TerminateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateInstance", TerminateInstanceResponse.class);
    }

    /**
     *This API is used to terminate a Serverless HBase instance.
     * @param req TerminateSLInstanceRequest
     * @return TerminateSLInstanceResponse
     * @throws TencentCloudSDKException
     */
    public TerminateSLInstanceResponse TerminateSLInstance(TerminateSLInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateSLInstance", TerminateSLInstanceResponse.class);
    }

    /**
     *This API is used to scale in Task nodes.
     * @param req TerminateTasksRequest
     * @return TerminateTasksResponse
     * @throws TencentCloudSDKException
     */
    public TerminateTasksResponse TerminateTasks(TerminateTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateTasks", TerminateTasksResponse.class);
    }

}
