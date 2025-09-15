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
     *This API is used to add scaling rules by load and time.
     * @param req AddMetricScaleStrategyRequest
     * @return AddMetricScaleStrategyResponse
     * @throws TencentCloudSDKException
     */
    public AddMetricScaleStrategyResponse AddMetricScaleStrategy(AddMetricScaleStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddMetricScaleStrategy", AddMetricScaleStrategyResponse.class);
    }

    /**
     *This API is used to add node specifications of the current cluster.
     * @param req AddNodeResourceConfigRequest
     * @return AddNodeResourceConfigResponse
     * @throws TencentCloudSDKException
     */
    public AddNodeResourceConfigResponse AddNodeResourceConfig(AddNodeResourceConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddNodeResourceConfig", AddNodeResourceConfigResponse.class);
    }

    /**
     *This API is available for clusters with OpenLDAP components configured.
This API is used to add user lists (user management).
     * @param req AddUsersForUserManagerRequest
     * @return AddUsersForUserManagerResponse
     * @throws TencentCloudSDKException
     */
    public AddUsersForUserManagerResponse AddUsersForUserManager(AddUsersForUserManagerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddUsersForUserManager", AddUsersForUserManagerResponse.class);
    }

    /**
     *This API is used to mount cloud disks.
     * @param req AttachDisksRequest
     * @return AttachDisksResponse
     * @throws TencentCloudSDKException
     */
    public AttachDisksResponse AttachDisks(AttachDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachDisks", AttachDisksResponse.class);
    }

    /**
     *This API is used to convert a monthly subscription cluster to a pay-as-you-go cluster (excluding cdb).
     * @param req ConvertPreToPostClusterRequest
     * @return ConvertPreToPostClusterResponse
     * @throws TencentCloudSDKException
     */
    public ConvertPreToPostClusterResponse ConvertPreToPostCluster(ConvertPreToPostClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ConvertPreToPostCluster", ConvertPreToPostClusterResponse.class);
    }

    /**
     *This API is used to create an EMR cluster instance.
     * @param req CreateClusterRequest
     * @return CreateClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterResponse CreateCluster(CreateClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCluster", CreateClusterResponse.class);
    }

    /**
     *This API is used to create user groups in batches under User Management.
     * @param req CreateGroupsSTDRequest
     * @return CreateGroupsSTDResponse
     * @throws TencentCloudSDKException
     */
    public CreateGroupsSTDResponse CreateGroupsSTD(CreateGroupsSTDRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGroupsSTD", CreateGroupsSTDResponse.class);
    }

    /**
     *This API is used to create an EMR cluster instance.
     * @param req CreateInstanceRequest
     * @return CreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceResponse CreateInstance(CreateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstance", CreateInstanceResponse.class);
    }

    /**
     *This API is used to create a Serverless HBase instance.- If the API call is successful, a Serverless HBase instance will be created. If the instance creation request is successful, the InstanceId of the created instance and the RequestID of the request will be returned.- This is an asynchronous API. The operation is not completed immediately when the API call returns. The instance operation result can be viewed by calling DescribeInstancesList to view the StatusDesc status of the current instance.
     * @param req CreateSLInstanceRequest
     * @return CreateSLInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateSLInstanceResponse CreateSLInstance(CreateSLInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSLInstance", CreateSLInstanceResponse.class);
    }

    /**
     *This API is used to delete automatic scaling rules. Nodes scaled based on these rules are destroyed in the background.
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
     *This API is used to delete the node specifications of the current cluster.
     * @param req DeleteNodeResourceConfigRequest
     * @return DeleteNodeResourceConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNodeResourceConfigResponse DeleteNodeResourceConfig(DeleteNodeResourceConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNodeResourceConfig", DeleteNodeResourceConfigResponse.class);
    }

    /**
     *This API is used to bring the configuration into effect in YARN resource scheduling after deployment.
     * @param req DeployYarnConfRequest
     * @return DeployYarnConfResponse
     * @throws TencentCloudSDKException
     */
    public DeployYarnConfResponse DeployYarnConf(DeployYarnConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeployYarnConf", DeployYarnConfResponse.class);
    }

    /**
     *This API is used to access the global configuration of automatic scaling.
     * @param req DescribeAutoScaleGroupGlobalConfRequest
     * @return DescribeAutoScaleGroupGlobalConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScaleGroupGlobalConfResponse DescribeAutoScaleGroupGlobalConf(DescribeAutoScaleGroupGlobalConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoScaleGroupGlobalConf", DescribeAutoScaleGroupGlobalConfResponse.class);
    }

    /**
     *This API is used to inquiry detailed records of cluster autoscaling.
     * @param req DescribeAutoScaleRecordsRequest
     * @return DescribeAutoScaleRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScaleRecordsResponse DescribeAutoScaleRecords(DescribeAutoScaleRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoScaleRecords", DescribeAutoScaleRecordsResponse.class);
    }

    /**
     *This API is used to access automatic scaling rules.
     * @param req DescribeAutoScaleStrategiesRequest
     * @return DescribeAutoScaleStrategiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScaleStrategiesResponse DescribeAutoScaleStrategies(DescribeAutoScaleStrategiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoScaleStrategies", DescribeAutoScaleStrategiesResponse.class);
    }

    /**
     *This API is used to query the EMR task running details status.
     * @param req DescribeClusterFlowStatusDetailRequest
     * @return DescribeClusterFlowStatusDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterFlowStatusDetailResponse DescribeClusterFlowStatusDetail(DescribeClusterFlowStatusDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterFlowStatusDetail", DescribeClusterFlowStatusDetailResponse.class);
    }

    /**
     *This API is used to query the information of nodes in a cluster.
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
     *This API is used to query the YARN application statistics API.
     * @param req DescribeEmrApplicationStaticsRequest
     * @return DescribeEmrApplicationStaticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEmrApplicationStaticsResponse DescribeEmrApplicationStatics(DescribeEmrApplicationStaticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEmrApplicationStatics", DescribeEmrApplicationStaticsResponse.class);
    }

    /**
     *This API is used to query the metric data on the monitoring overview page.
     * @param req DescribeEmrOverviewMetricsRequest
     * @return DescribeEmrOverviewMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEmrOverviewMetricsResponse DescribeEmrOverviewMetrics(DescribeEmrOverviewMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEmrOverviewMetrics", DescribeEmrOverviewMetricsResponse.class);
    }

    /**
     *This API is used to query the global configurations of YARN Resource Scheduling.
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
     *This API is used to access the overview of HBase table-level monitoring data.
     * @param req DescribeHBaseTableOverviewRequest
     * @return DescribeHBaseTableOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHBaseTableOverviewResponse DescribeHBaseTableOverview(DescribeHBaseTableOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHBaseTableOverview", DescribeHBaseTableOverviewResponse.class);
    }

    /**
     *This API is used to query information of file(s) stored in HDFS.
     * @param req DescribeHDFSStorageInfoRequest
     * @return DescribeHDFSStorageInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHDFSStorageInfoResponse DescribeHDFSStorageInfo(DescribeHDFSStorageInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHDFSStorageInfo", DescribeHDFSStorageInfoResponse.class);
    }

    /**
     *This API is used to inquiry Hive query data.
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
     *This API is used to query the information of instances in a cluster.
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
     *This API is used to query Kyuubi query information.
     * @param req DescribeKyuubiQueryInfoRequest
     * @return DescribeKyuubiQueryInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKyuubiQueryInfoResponse DescribeKyuubiQueryInfo(DescribeKyuubiQueryInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKyuubiQueryInfo", DescribeKyuubiQueryInfoResponse.class);
    }

    /**
     *This API is used to query data disk information of nodes.
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
     *This API is used to query YARN resource scheduling information. It has been deprecated. You can use the DescribeYarnQueue API to query queue information.
     * @param req DescribeResourceScheduleRequest
     * @return DescribeResourceScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceScheduleResponse DescribeResourceSchedule(DescribeResourceScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceSchedule", DescribeResourceScheduleResponse.class);
    }

    /**
     *This API is used to query change details in YARN resource scheduling.
     * @param req DescribeResourceScheduleDiffDetailRequest
     * @return DescribeResourceScheduleDiffDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceScheduleDiffDetailResponse DescribeResourceScheduleDiffDetail(DescribeResourceScheduleDiffDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceScheduleDiffDetail", DescribeResourceScheduleDiffDetailResponse.class);
    }

    /**
     *This API is used to query the basic information of Serverless HBase instances.
     * @param req DescribeSLInstanceRequest
     * @return DescribeSLInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSLInstanceResponse DescribeSLInstance(DescribeSLInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSLInstance", DescribeSLInstanceResponse.class);
    }

    /**
     *This API is used to query the detailed information of the Serverless HBase instance list.
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
     *This API is used to obtain a Spark application list.
     * @param req DescribeSparkApplicationsRequest
     * @return DescribeSparkApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkApplicationsResponse DescribeSparkApplications(DescribeSparkApplicationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSparkApplications", DescribeSparkApplicationsResponse.class);
    }

    /**
     *This API is used to query the Spark query information list.
     * @param req DescribeSparkQueriesRequest
     * @return DescribeSparkQueriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSparkQueriesResponse DescribeSparkQueries(DescribeSparkQueriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSparkQueries", DescribeSparkQueriesResponse.class);
    }

    /**
     *This API is used to query StarRocks information.
     * @param req DescribeStarRocksQueryInfoRequest
     * @return DescribeStarRocksQueryInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStarRocksQueryInfoResponse DescribeStarRocksQueryInfo(DescribeStarRocksQueryInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStarRocksQueryInfo", DescribeStarRocksQueryInfoResponse.class);
    }

    /**
     *This API is used to query Trino(PrestoSQL) query information.
     * @param req DescribeTrinoQueryInfoRequest
     * @return DescribeTrinoQueryInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrinoQueryInfoResponse DescribeTrinoQueryInfo(DescribeTrinoQueryInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrinoQueryInfo", DescribeTrinoQueryInfoResponse.class);
    }

    /**
     *This API is available for clusters with OpenLDAP components configured.
This API is used to export users in batches. For a Kerberos cluster, set `NeedKeytabInfo` to `true` to obtain the download link of the Keytab file. If `SupportDownLoadKeyTab` is `true`, but `DownLoadKeyTabUrl` is null, the Keytab file is not ready yet (being generated) in the backend.
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
     *This API is used to view the YARN resource scheduling history. It has been deprecated. You can use the Process Center to view the history records.
     * @param req DescribeYarnScheduleHistoryRequest
     * @return DescribeYarnScheduleHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeYarnScheduleHistoryResponse DescribeYarnScheduleHistory(DescribeYarnScheduleHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeYarnScheduleHistory", DescribeYarnScheduleHistoryResponse.class);
    }

    /**
     *This API is used to query price of instance creation.
     * @param req InquiryPriceCreateInstanceRequest
     * @return InquiryPriceCreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateInstanceResponse InquiryPriceCreateInstance(InquiryPriceCreateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceCreateInstance", InquiryPriceCreateInstanceResponse.class);
    }

    /**
     *This API is used to query the price for renewal.
     * @param req InquiryPriceRenewInstanceRequest
     * @return InquiryPriceRenewInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceRenewInstanceResponse InquiryPriceRenewInstance(InquiryPriceRenewInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceRenewInstance", InquiryPriceRenewInstanceResponse.class);
    }

    /**
     *This API is used to query price of scale-out.
     * @param req InquiryPriceScaleOutInstanceRequest
     * @return InquiryPriceScaleOutInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceScaleOutInstanceResponse InquiryPriceScaleOutInstance(InquiryPriceScaleOutInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceScaleOutInstance", InquiryPriceScaleOutInstanceResponse.class);
    }

    /**
     *This API is used to query price of scaling.
     * @param req InquiryPriceUpdateInstanceRequest
     * @return InquiryPriceUpdateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceUpdateInstanceResponse InquiryPriceUpdateInstance(InquiryPriceUpdateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceUpdateInstance", InquiryPriceUpdateInstanceResponse.class);
    }

    /**
     *This API is used to introduce the prerequisite prepaid clusters.
This API is used to enable or disable automatic renewal at the resource level.
     * @param req ModifyAutoRenewFlagRequest
     * @return ModifyAutoRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoRenewFlagResponse ModifyAutoRenewFlag(ModifyAutoRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoRenewFlag", ModifyAutoRenewFlagResponse.class);
    }

    /**
     *This API is used to modify automatic scaling rules.
     * @param req ModifyAutoScaleStrategyRequest
     * @return ModifyAutoScaleStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoScaleStrategyResponse ModifyAutoScaleStrategy(ModifyAutoScaleStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoScaleStrategy", ModifyAutoScaleStrategyResponse.class);
    }

    /**
     *This API is used to modify the global configuration of YARN Resource Scheduling.
     * @param req ModifyGlobalConfigRequest
     * @return ModifyGlobalConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGlobalConfigResponse ModifyGlobalConfig(ModifyGlobalConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGlobalConfig", ModifyGlobalConfigResponse.class);
    }

    /**
     *This API is used to set inspection task configurations.
     * @param req ModifyInspectionSettingsRequest
     * @return ModifyInspectionSettingsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInspectionSettingsResponse ModifyInspectionSettings(ModifyInspectionSettingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInspectionSettings", ModifyInspectionSettingsResponse.class);
    }

    /**
     *This API is used to modify a cluster name.
     * @param req ModifyInstanceBasicRequest
     * @return ModifyInstanceBasicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceBasicResponse ModifyInstanceBasic(ModifyInstanceBasicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceBasic", ModifyInstanceBasicResponse.class);
    }

    /**
     *This API is used to resize an instance.
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
     *This API is used to modify a YARN resource scheduler. After the modification, you can click Deploy to bring it into effect.
     * @param req ModifyResourceSchedulerRequest
     * @return ModifyResourceSchedulerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourceSchedulerResponse ModifyResourceScheduler(ModifyResourceSchedulerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyResourceScheduler", ModifyResourceSchedulerResponse.class);
    }

    /**
     *This API is used to forcibly modify tags.
     * @param req ModifyResourcesTagsRequest
     * @return ModifyResourcesTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourcesTagsResponse ModifyResourcesTags(ModifyResourcesTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyResourcesTags", ModifyResourcesTagsResponse.class);
    }

    /**
     *This API is used to resize a Serverless HBase instance.- If the API call is successful, a Serverless HBase instance will be created. If the instance creation request is successful, the RequestID of the request will be returned.- This is an asynchronous API. The operation is not completed immediately when the API call returns. The instance operation result can be viewed by calling DescribeInstancesList to view the StatusDesc status of the current instance.
     * @param req ModifySLInstanceRequest
     * @return ModifySLInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifySLInstanceResponse ModifySLInstance(ModifySLInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySLInstance", ModifySLInstanceResponse.class);
    }

    /**
     *This API is used to modify the Serverless HBase instance name.
     * @param req ModifySLInstanceBasicRequest
     * @return ModifySLInstanceBasicResponse
     * @throws TencentCloudSDKException
     */
    public ModifySLInstanceBasicResponse ModifySLInstanceBasic(ModifySLInstanceBasicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySLInstanceBasic", ModifySLInstanceBasicResponse.class);
    }

    /**
     *This API is used to modify user groups under User Management.
     * @param req ModifyUserGroupRequest
     * @return ModifyUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserGroupResponse ModifyUserGroup(ModifyUserGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserGroup", ModifyUserGroupResponse.class);
    }

    /**
     *This API is used to change user password (user management).
     * @param req ModifyUserManagerPwdRequest
     * @return ModifyUserManagerPwdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserManagerPwdResponse ModifyUserManagerPwd(ModifyUserManagerPwdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserManagerPwd", ModifyUserManagerPwdResponse.class);
    }

    /**
     *This API is used to change the user information of user groups.
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
     *This API is used to scale out the cloud data disk.
     * @param req ResizeDataDisksRequest
     * @return ResizeDataDisksResponse
     * @throws TencentCloudSDKException
     */
    public ResizeDataDisksResponse ResizeDataDisks(ResizeDataDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResizeDataDisks", ResizeDataDisksResponse.class);
    }

    /**
     *This API is used to scale out a cluster.
     * @param req ScaleOutClusterRequest
     * @return ScaleOutClusterResponse
     * @throws TencentCloudSDKException
     */
    public ScaleOutClusterResponse ScaleOutCluster(ScaleOutClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleOutCluster", ScaleOutClusterResponse.class);
    }

    /**
     *This API is used to scale out instances.
     * @param req ScaleOutInstanceRequest
     * @return ScaleOutInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ScaleOutInstanceResponse ScaleOutInstance(ScaleOutInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleOutInstance", ScaleOutInstanceResponse.class);
    }

    /**
     *This API is used to set specifications for a node in the current cluster to default or not.
     * @param req SetNodeResourceConfigDefaultRequest
     * @return SetNodeResourceConfigDefaultResponse
     * @throws TencentCloudSDKException
     */
    public SetNodeResourceConfigDefaultResponse SetNodeResourceConfigDefault(SetNodeResourceConfigDefaultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetNodeResourceConfigDefault", SetNodeResourceConfigDefaultResponse.class);
    }

    /**
     *This API is used to start, stop, or restart services.
     * @param req StartStopServiceOrMonitorRequest
     * @return StartStopServiceOrMonitorResponse
     * @throws TencentCloudSDKException
     */
    public StartStopServiceOrMonitorResponse StartStopServiceOrMonitor(StartStopServiceOrMonitorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartStopServiceOrMonitor", StartStopServiceOrMonitorResponse.class);
    }

    /**
     *This API is used to terminate cluster nodes.
     * @param req TerminateClusterNodesRequest
     * @return TerminateClusterNodesResponse
     * @throws TencentCloudSDKException
     */
    public TerminateClusterNodesResponse TerminateClusterNodes(TerminateClusterNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateClusterNodes", TerminateClusterNodesResponse.class);
    }

    /**
     *This API is used to terminate EMR instances. It is only supported in the official paid edition of EMR.
     * @param req TerminateInstanceRequest
     * @return TerminateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public TerminateInstanceResponse TerminateInstance(TerminateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateInstance", TerminateInstanceResponse.class);
    }

    /**
     *This API is used to terminate a Serverless HBase instance.
     * @param req TerminateSLInstanceRequest
     * @return TerminateSLInstanceResponse
     * @throws TencentCloudSDKException
     */
    public TerminateSLInstanceResponse TerminateSLInstance(TerminateSLInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateSLInstance", TerminateSLInstanceResponse.class);
    }

    /**
     *This API is used to terminate a task node.
     * @param req TerminateTasksRequest
     * @return TerminateTasksResponse
     * @throws TencentCloudSDKException
     */
    public TerminateTasksResponse TerminateTasks(TerminateTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateTasks", TerminateTasksResponse.class);
    }

}
