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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBlockIPListResponse extends AbstractModel{

    /**
    * Number of returned IPs
    */
    @SerializedName("BlockedIPCount")
    @Expose
    private Long BlockedIPCount;

    /**
    * Field for getting real client IP
    */
    @SerializedName("ClientIPField")
    @Expose
    private String ClientIPField;

    /**
    * List of IPs added to blocklist 12360
    */
    @SerializedName("BlockedIPList")
    @Expose
    private BlockedIP [] BlockedIPList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of returned IPs 
     * @return BlockedIPCount Number of returned IPs
     */
    public Long getBlockedIPCount() {
        return this.BlockedIPCount;
    }

    /**
     * Set Number of returned IPs
     * @param BlockedIPCount Number of returned IPs
     */
    public void setBlockedIPCount(Long BlockedIPCount) {
        this.BlockedIPCount = BlockedIPCount;
    }

    /**
     * Get Field for getting real client IP 
     * @return ClientIPField Field for getting real client IP
     */
    public String getClientIPField() {
        return this.ClientIPField;
    }

    /**
     * Set Field for getting real client IP
     * @param ClientIPField Field for getting real client IP
     */
    public void setClientIPField(String ClientIPField) {
        this.ClientIPField = ClientIPField;
    }

    /**
     * Get List of IPs added to blocklist 12360 
     * @return BlockedIPList List of IPs added to blocklist 12360
     */
    public BlockedIP [] getBlockedIPList() {
        return this.BlockedIPList;
    }

    /**
     * Set List of IPs added to blocklist 12360
     * @param BlockedIPList List of IPs added to blocklist 12360
     */
    public void setBlockedIPList(BlockedIP [] BlockedIPList) {
        this.BlockedIPList = BlockedIPList;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBlockIPListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBlockIPListResponse(DescribeBlockIPListResponse source) {
        if (source.BlockedIPCount != null) {
            this.BlockedIPCount = new Long(source.BlockedIPCount);
        }
        if (source.ClientIPField != null) {
            this.ClientIPField = new String(source.ClientIPField);
        }
        if (source.BlockedIPList != null) {
            this.BlockedIPList = new BlockedIP[source.BlockedIPList.length];
            for (int i = 0; i < source.BlockedIPList.length; i++) {
                this.BlockedIPList[i] = new BlockedIP(source.BlockedIPList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlockedIPCount", this.BlockedIPCount);
        this.setParamSimple(map, prefix + "ClientIPField", this.ClientIPField);
        this.setParamArrayObj(map, prefix + "BlockedIPList.", this.BlockedIPList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

