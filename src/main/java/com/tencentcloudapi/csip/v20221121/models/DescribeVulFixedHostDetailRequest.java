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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulFixedHostDetailRequest extends AbstractModel {

    /**
    * <p>Vulnerability ID</p>
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * <p>Host instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Paging offset, used for associated component & path list pagination.<br>Value ranges from 0 to +∞.<br>Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of results per page, used for paginating associated components & path list<br>Value ranges from 1 to 100<br>Default value: 10</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Group Account Member ID
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>Vulnerability ID</p> 
     * @return VulId <p>Vulnerability ID</p>
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set <p>Vulnerability ID</p>
     * @param VulId <p>Vulnerability ID</p>
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get <p>Host instance ID.</p> 
     * @return InstanceId <p>Host instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Host instance ID.</p>
     * @param InstanceId <p>Host instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Paging offset, used for associated component & path list pagination.<br>Value ranges from 0 to +∞.<br>Default value: 0.</p> 
     * @return Offset <p>Paging offset, used for associated component & path list pagination.<br>Value ranges from 0 to +∞.<br>Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Paging offset, used for associated component & path list pagination.<br>Value ranges from 0 to +∞.<br>Default value: 0.</p>
     * @param Offset <p>Paging offset, used for associated component & path list pagination.<br>Value ranges from 0 to +∞.<br>Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of results per page, used for paginating associated components & path list<br>Value ranges from 1 to 100<br>Default value: 10</p> 
     * @return Limit <p>Number of results per page, used for paginating associated components & path list<br>Value ranges from 1 to 100<br>Default value: 10</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of results per page, used for paginating associated components & path list<br>Value ranges from 1 to 100<br>Default value: 10</p>
     * @param Limit <p>Number of results per page, used for paginating associated components & path list<br>Value ranges from 1 to 100<br>Default value: 10</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Group Account Member ID 
     * @return MemberId Group Account Member ID
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Group Account Member ID
     * @param MemberId Group Account Member ID
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public DescribeVulFixedHostDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulFixedHostDetailRequest(DescribeVulFixedHostDetailRequest source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

