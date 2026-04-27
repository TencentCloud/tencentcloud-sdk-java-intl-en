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
package com.tencentcloudapi.edgezone.v20260401;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.edgezone.v20260401.models.*;

public class EdgezoneClient extends AbstractClient{
    private static String endpoint = "edgezone.intl.tencentcloudapi.com";
    private static String service = "edgezone";
    private static String version = "2026-04-01";

    public EdgezoneClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EdgezoneClient(Credential credential, String region, ClientProfile profile) {
        super(EdgezoneClient.endpoint, EdgezoneClient.version, credential, region, profile);
    }

    /**
     *This API is used to submit a request for multiple IP addresses from the static IP pool to specify a public network instance (random allocation). Need to check user quota before applying.
This API is applicable only to public network instances with `RouteMode=static`. Calling this API for BGP/OSPF instances will return an error.
     * @param req ApplyPublicIpsRequest
     * @return ApplyPublicIpsResponse
     * @throws TencentCloudSDKException
     */
    public ApplyPublicIpsResponse ApplyPublicIps(ApplyPublicIpsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyPublicIps", ApplyPublicIpsResponse.class);
    }

    /**
     *This API is used to create a physical machine instance. The system automatically allocates physical machine resources and completes installation. If the user is not in the current availability zone, the system automatically enables billing. It supports concurrent allocation of physical machine resources and async execution of network assignment and installation tasks.
     * @param req CreateInstancesRequest
     * @return CreateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstancesResponse CreateInstances(CreateInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstances", CreateInstancesResponse.class);
    }

    /**
     *Create a private network instance. A user can only create one private network instance in an availability zone. The subnet range is collectively determined by both parameters: Network (network number) and Mask (bit number of the mask). Network must be a valid network address from one of the three RFC 1918 private address ranges: 10.0.0.0/8, 172.16.0.0/12, or 192.168.0.0/16, and all host bits must be 0 (meaning the combination of Network and Mask cannot have any host bits set, such as 10.0.0.1/24 is illegal, use 10.0.0.0/24 instead). The maximum Mask is unified as 28, and the minimum is determined by the address range it belongs to: 10.x.x.x allows 8–28, 172.16.x.x allows 12–28, and 192.168.x.x allows 16–28.
     * @param req CreatePrivateNetworkInstanceRequest
     * @return CreatePrivateNetworkInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrivateNetworkInstanceResponse CreatePrivateNetworkInstance(CreatePrivateNetworkInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrivateNetworkInstance", CreatePrivateNetworkInstanceResponse.class);
    }

    /**
     *The user inputs the availability zone ID, public network instance name, network line, and routing mode to create a public network instance. A user can only create one public network instance in an availability zone.
Public network instances in **static** routing mode require users to proactively apply for and release public IP addresses.
Public network instances with routing mode set to **OSPF, BGP** automatically allocate public IP ranges when creating and auto release public IP ranges upon termination.
     * @param req CreatePublicNetworkInstanceRequest
     * @return CreatePublicNetworkInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreatePublicNetworkInstanceResponse CreatePublicNetworkInstance(CreatePublicNetworkInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePublicNetworkInstance", CreatePublicNetworkInstanceResponse.class);
    }

    /**
     *Delete a private network instance
     * @param req DeletePrivateNetworkInstanceRequest
     * @return DeletePrivateNetworkInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrivateNetworkInstanceResponse DeletePrivateNetworkInstance(DeletePrivateNetworkInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrivateNetworkInstance", DeletePrivateNetworkInstanceResponse.class);
    }

    /**
     *Modify public network instance info
     * @param req DeletePublicNetworkInstanceRequest
     * @return DeletePublicNetworkInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeletePublicNetworkInstanceResponse DeletePublicNetworkInstance(DeletePublicNetworkInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePublicNetworkInstance", DeletePublicNetworkInstanceResponse.class);
    }

    /**
     *This API is used to query the model quota list under the account by availability zone dimensionality based on AppId. If a Zone is input, it returns the model quota under the designated availability zone. If not, it returns the model quota of all AZs under the account.
     * @param req DescribeInstanceTypesRequest
     * @return DescribeInstanceTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceTypesResponse DescribeInstanceTypes(DescribeInstanceTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceTypes", DescribeInstanceTypesResponse.class);
    }

    /**
     *This API is used to query physical machine instance list, support by instance ID, instance name, availability zone, instance status with conditional filtering, and support paging query.
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *Query private network instances, support through parameters such as private network instance ID, instance name, and availability zone id.
     * @param req DescribePrivateNetworkInstancesRequest
     * @return DescribePrivateNetworkInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateNetworkInstancesResponse DescribePrivateNetworkInstances(DescribePrivateNetworkInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivateNetworkInstances", DescribePrivateNetworkInstancesResponse.class);
    }

    /**
     *Query the public network Ip information of the user. For public network instances with routing mode set to Static, return all applied public network Ip information. For public network instances with routing mode set to Ospf and Bgp, return Ip range information directly.
     * @param req DescribePublicIpsRequest
     * @return DescribePublicIpsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicIpsResponse DescribePublicIps(DescribePublicIpsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublicIps", DescribePublicIpsResponse.class);
    }

    /**
     *Query public network instance list, support conditional filtering by instance ID, instance name, availability zone, and support paging query.
     * @param req DescribePublicNetworkInstancesRequest
     * @return DescribePublicNetworkInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicNetworkInstancesResponse DescribePublicNetworkInstances(DescribePublicNetworkInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublicNetworkInstances", DescribePublicNetworkInstancesResponse.class);
    }

    /**
     *Query statistics by metric name. Data is aggregated at 1-minute intervals.
     * @param req DescribeZoneDataRequest
     * @return DescribeZoneDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneDataResponse DescribeZoneData(DescribeZoneDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZoneData", DescribeZoneDataResponse.class);
    }

    /**
     *Cross-regional aggregate query returns the AZ list for the specified AppId in ALL configured regions. The local region directly performs a database query, while remote regions send HTTP requests to each region's DescribeAppZones API and merge the results.
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZones", DescribeZonesResponse.class);
    }

    /**
     *This API is used to modify the attributes of a physical machine instance, supporting modification of the instance name and update of the public IP address (IPv4/IPv6). At least one of InstanceName and NewPublicIp must be input.
     * @param req ModifyInstanceAttributeRequest
     * @return ModifyInstanceAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceAttributeResponse ModifyInstanceAttribute(ModifyInstanceAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceAttribute", ModifyInstanceAttributeResponse.class);
    }

    /**
     *Modify private network instance info
     * @param req ModifyPrivateNetworkInstanceRequest
     * @return ModifyPrivateNetworkInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrivateNetworkInstanceResponse ModifyPrivateNetworkInstance(ModifyPrivateNetworkInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrivateNetworkInstance", ModifyPrivateNetworkInstanceResponse.class);
    }

    /**
     *Modify public network instance info
     * @param req ModifyPublicNetworkInstanceRequest
     * @return ModifyPublicNetworkInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPublicNetworkInstanceResponse ModifyPublicNetworkInstance(ModifyPublicNetworkInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPublicNetworkInstance", ModifyPublicNetworkInstanceResponse.class);
    }

    /**
     *Batch release IPv4 addresses assigned to STATIC public network instances but not bound to physical servers
This API is applicable only to STATIC mode instances. The CIDR of BGP/OSPF instances is automatically returned during deletion with no need to manually release single IP addresses.
     * @param req ReleasePublicIpRequest
     * @return ReleasePublicIpResponse
     * @throws TencentCloudSDKException
     */
    public ReleasePublicIpResponse ReleasePublicIp(ReleasePublicIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleasePublicIp", ReleasePublicIpResponse.class);
    }

    /**
     *This API is used to terminate a physical machine instance and free up resources. It synchronously releases network resources (IP recycling) and updates status to terminating, while performing disk cleanup asynchronously in the background. It supports partially successful operations.
     * @param req TerminateInstancesRequest
     * @return TerminateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public TerminateInstancesResponse TerminateInstances(TerminateInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateInstances", TerminateInstancesResponse.class);
    }

}
