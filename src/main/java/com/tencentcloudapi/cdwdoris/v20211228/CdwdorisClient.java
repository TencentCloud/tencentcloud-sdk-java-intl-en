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
package com.tencentcloudapi.cdwdoris.v20211228;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cdwdoris.v20211228.models.*;

public class CdwdorisClient extends AbstractClient{
    private static String endpoint = "cdwdoris.tencentcloudapi.com";
    private static String service = "cdwdoris";
    private static String version = "2021-12-28";
    
    public CdwdorisClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CdwdorisClient(Credential credential, String region, ClientProfile profile) {
        super(CdwdorisClient.endpoint, CdwdorisClient.version, credential, region, profile);
    }

    /**
     *This API is used to create clusters.
     * @param req CreateInstanceNewRequest
     * @return CreateInstanceNewResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceNewResponse CreateInstanceNew(CreateInstanceNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstanceNew", CreateInstanceNewResponse.class);
    }

    /**
     *This API is used to get the contents of the latest configuration files (config.xml, metrika.xml, and user.xml) of the cluster and display them to the user.
     * @param req DescribeClusterConfigsRequest
     * @return DescribeClusterConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterConfigsResponse DescribeClusterConfigs(DescribeClusterConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterConfigs", DescribeClusterConfigsResponse.class);
    }

    /**
     *This API is used to download database audit logs.
     * @param req DescribeDatabaseAuditDownloadRequest
     * @return DescribeDatabaseAuditDownloadResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseAuditDownloadResponse DescribeDatabaseAuditDownload(DescribeDatabaseAuditDownloadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabaseAuditDownload", DescribeDatabaseAuditDownloadResponse.class);
    }

    /**
     *This API is used to get database audit records.
     * @param req DescribeDatabaseAuditRecordsRequest
     * @return DescribeDatabaseAuditRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseAuditRecordsResponse DescribeDatabaseAuditRecords(DescribeDatabaseAuditRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabaseAuditRecords", DescribeDatabaseAuditRecordsResponse.class);
    }

    /**
     *This API is used to query the specific information of a cluster based on the cluster ID.
     * @param req DescribeInstanceRequest
     * @return DescribeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceResponse DescribeInstance(DescribeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstance", DescribeInstanceResponse.class);
    }

    /**
     *This API is used to get the list of cluster node information.
     * @param req DescribeInstanceNodesRequest
     * @return DescribeInstanceNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceNodesResponse DescribeInstanceNodes(DescribeInstanceNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceNodes", DescribeInstanceNodesResponse.class);
    }

    /**
     *This API is used to get the BE/FE node roles.
     * @param req DescribeInstanceNodesInfoRequest
     * @return DescribeInstanceNodesInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceNodesInfoResponse DescribeInstanceNodesInfo(DescribeInstanceNodesInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceNodesInfo", DescribeInstanceNodesInfoResponse.class);
    }

    /**
     *This API is used to display cluster status, process progress, etc. in the cluster details page.
     * @param req DescribeInstanceStateRequest
     * @return DescribeInstanceStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceStateResponse DescribeInstanceState(DescribeInstanceStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceState", DescribeInstanceStateResponse.class);
    }

    /**
     *This API is used to get the list of clusters.
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *This API is used to get the slow log list.
     * @param req DescribeSlowQueryRecordsRequest
     * @return DescribeSlowQueryRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowQueryRecordsResponse DescribeSlowQueryRecords(DescribeSlowQueryRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowQueryRecords", DescribeSlowQueryRecordsResponse.class);
    }

    /**
     *This API is used to download slow log files.
     * @param req DescribeSlowQueryRecordsDownloadRequest
     * @return DescribeSlowQueryRecordsDownloadResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowQueryRecordsDownloadResponse DescribeSlowQueryRecordsDownload(DescribeSlowQueryRecordsDownloadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowQueryRecordsDownload", DescribeSlowQueryRecordsDownloadResponse.class);
    }

    /**
     *This API is used to terminate clusters.
     * @param req DestroyInstanceRequest
     * @return DestroyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyInstanceResponse DestroyInstance(DestroyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyInstance", DestroyInstanceResponse.class);
    }

    /**
     *This API is used to modify the cluster's name.
     * @param req ModifyInstanceRequest
     * @return ModifyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceResponse ModifyInstance(ModifyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstance", ModifyInstanceResponse.class);
    }

    /**
     *This API is used to expand cloud disks.
     * @param req ResizeDiskRequest
     * @return ResizeDiskResponse
     * @throws TencentCloudSDKException
     */
    public ResizeDiskResponse ResizeDisk(ResizeDiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResizeDisk", ResizeDiskResponse.class);
    }

    /**
     *This API is used to indicate the rolling restart of the clusters.
     * @param req RestartClusterForNodeRequest
     * @return RestartClusterForNodeResponse
     * @throws TencentCloudSDKException
     */
    public RestartClusterForNodeResponse RestartClusterForNode(RestartClusterForNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartClusterForNode", RestartClusterForNodeResponse.class);
    }

    /**
     *This API is used to horizontally scale out nodes.
     * @param req ScaleOutInstanceRequest
     * @return ScaleOutInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ScaleOutInstanceResponse ScaleOutInstance(ScaleOutInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleOutInstance", ScaleOutInstanceResponse.class);
    }

    /**
     *This API is used to scale up/down computing resources.
     * @param req ScaleUpInstanceRequest
     * @return ScaleUpInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ScaleUpInstanceResponse ScaleUpInstance(ScaleUpInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleUpInstance", ScaleUpInstanceResponse.class);
    }

}
