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
     * This API is used to query the Yarn application statistics.
     * @param req DescribeEmrApplicationStaticsRequest
     * @return DescribeEmrApplicationStaticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEmrApplicationStaticsResponse DescribeEmrApplicationStatics(DescribeEmrApplicationStaticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEmrApplicationStatics", DescribeEmrApplicationStaticsResponse.class);
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
     *This API is used to query the data of YARN Resource Scheduling.
     * @param req DescribeResourceScheduleRequest
     * @return DescribeResourceScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceScheduleResponse DescribeResourceSchedule(DescribeResourceScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceSchedule", DescribeResourceScheduleResponse.class);
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
     *This API is used to modify the resource configuration of YARN Resource Scheduling.
     * @param req ModifyResourceScheduleConfigRequest
     * @return ModifyResourceScheduleConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourceScheduleConfigResponse ModifyResourceScheduleConfig(ModifyResourceScheduleConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyResourceScheduleConfig", ModifyResourceScheduleConfigResponse.class);
    }

    /**
     *This API is used to modify the YARN resource scheduler (the change will take effect after you click Apply).
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
