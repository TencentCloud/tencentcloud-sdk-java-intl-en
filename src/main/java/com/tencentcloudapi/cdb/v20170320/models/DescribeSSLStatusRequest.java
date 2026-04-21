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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSSLStatusRequest extends AbstractModel {

    /**
    * Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872) API. Note: Either the instance ID or read-only group ID parameter needs to be specified. To query the enabling status of the SSL for two-node or three-node instances, you need to specify the instance ID parameter. Single-node (cloud disk) and Cluster Edition instances do not support enabling SSL; thus, queries are not supported.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Read-only group ID, which can be obtained through the [DescribeRoGroups](https://www.tencentcloud.com/document/product/236/35704) API. Note: Either the instance ID or read-only group ID parameter needs to be specified. To query the enabling status of the SSL for read-only instances or groups, you need to specify the RoGroupId parameter. Note that the value should be the read-only group ID. Single-node (cloud disk) and Cluster Edition instances do not support enabling SSL; thus, queries are not supported.
    */
    @SerializedName("RoGroupId")
    @Expose
    private String RoGroupId;

    /**
     * Get Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872) API. Note: Either the instance ID or read-only group ID parameter needs to be specified. To query the enabling status of the SSL for two-node or three-node instances, you need to specify the instance ID parameter. Single-node (cloud disk) and Cluster Edition instances do not support enabling SSL; thus, queries are not supported. 
     * @return InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872) API. Note: Either the instance ID or read-only group ID parameter needs to be specified. To query the enabling status of the SSL for two-node or three-node instances, you need to specify the instance ID parameter. Single-node (cloud disk) and Cluster Edition instances do not support enabling SSL; thus, queries are not supported.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872) API. Note: Either the instance ID or read-only group ID parameter needs to be specified. To query the enabling status of the SSL for two-node or three-node instances, you need to specify the instance ID parameter. Single-node (cloud disk) and Cluster Edition instances do not support enabling SSL; thus, queries are not supported.
     * @param InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872) API. Note: Either the instance ID or read-only group ID parameter needs to be specified. To query the enabling status of the SSL for two-node or three-node instances, you need to specify the instance ID parameter. Single-node (cloud disk) and Cluster Edition instances do not support enabling SSL; thus, queries are not supported.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Read-only group ID, which can be obtained through the [DescribeRoGroups](https://www.tencentcloud.com/document/product/236/35704) API. Note: Either the instance ID or read-only group ID parameter needs to be specified. To query the enabling status of the SSL for read-only instances or groups, you need to specify the RoGroupId parameter. Note that the value should be the read-only group ID. Single-node (cloud disk) and Cluster Edition instances do not support enabling SSL; thus, queries are not supported. 
     * @return RoGroupId Read-only group ID, which can be obtained through the [DescribeRoGroups](https://www.tencentcloud.com/document/product/236/35704) API. Note: Either the instance ID or read-only group ID parameter needs to be specified. To query the enabling status of the SSL for read-only instances or groups, you need to specify the RoGroupId parameter. Note that the value should be the read-only group ID. Single-node (cloud disk) and Cluster Edition instances do not support enabling SSL; thus, queries are not supported.
     */
    public String getRoGroupId() {
        return this.RoGroupId;
    }

    /**
     * Set Read-only group ID, which can be obtained through the [DescribeRoGroups](https://www.tencentcloud.com/document/product/236/35704) API. Note: Either the instance ID or read-only group ID parameter needs to be specified. To query the enabling status of the SSL for read-only instances or groups, you need to specify the RoGroupId parameter. Note that the value should be the read-only group ID. Single-node (cloud disk) and Cluster Edition instances do not support enabling SSL; thus, queries are not supported.
     * @param RoGroupId Read-only group ID, which can be obtained through the [DescribeRoGroups](https://www.tencentcloud.com/document/product/236/35704) API. Note: Either the instance ID or read-only group ID parameter needs to be specified. To query the enabling status of the SSL for read-only instances or groups, you need to specify the RoGroupId parameter. Note that the value should be the read-only group ID. Single-node (cloud disk) and Cluster Edition instances do not support enabling SSL; thus, queries are not supported.
     */
    public void setRoGroupId(String RoGroupId) {
        this.RoGroupId = RoGroupId;
    }

    public DescribeSSLStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSSLStatusRequest(DescribeSSLStatusRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RoGroupId != null) {
            this.RoGroupId = new String(source.RoGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RoGroupId", this.RoGroupId);

    }
}

