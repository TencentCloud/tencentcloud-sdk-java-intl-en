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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeListPacketFilterConfigRequest extends AbstractModel {

    /**
    * Starting offset of the page. Value: (number of pages – 1) * items per page.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of items per page. The default value is 20 when Limit = 0. The maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Anti-DDoS instance ID filter. Anti-DDoS instance prefix wildcard search is supported. For example, you can filter Anti-DDoS Pro instances by `bgp-*`.
    */
    @SerializedName("FilterInstanceId")
    @Expose
    private String FilterInstanceId;

    /**
    * IP filter
    */
    @SerializedName("FilterIp")
    @Expose
    private String FilterIp;

    /**
     * Get Starting offset of the page. Value: (number of pages – 1) * items per page. 
     * @return Offset Starting offset of the page. Value: (number of pages – 1) * items per page.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting offset of the page. Value: (number of pages – 1) * items per page.
     * @param Offset Starting offset of the page. Value: (number of pages – 1) * items per page.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of items per page. The default value is 20 when Limit = 0. The maximum value is 100. 
     * @return Limit Number of items per page. The default value is 20 when Limit = 0. The maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items per page. The default value is 20 when Limit = 0. The maximum value is 100.
     * @param Limit Number of items per page. The default value is 20 when Limit = 0. The maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Anti-DDoS instance ID filter. Anti-DDoS instance prefix wildcard search is supported. For example, you can filter Anti-DDoS Pro instances by `bgp-*`. 
     * @return FilterInstanceId Anti-DDoS instance ID filter. Anti-DDoS instance prefix wildcard search is supported. For example, you can filter Anti-DDoS Pro instances by `bgp-*`.
     */
    public String getFilterInstanceId() {
        return this.FilterInstanceId;
    }

    /**
     * Set Anti-DDoS instance ID filter. Anti-DDoS instance prefix wildcard search is supported. For example, you can filter Anti-DDoS Pro instances by `bgp-*`.
     * @param FilterInstanceId Anti-DDoS instance ID filter. Anti-DDoS instance prefix wildcard search is supported. For example, you can filter Anti-DDoS Pro instances by `bgp-*`.
     */
    public void setFilterInstanceId(String FilterInstanceId) {
        this.FilterInstanceId = FilterInstanceId;
    }

    /**
     * Get IP filter 
     * @return FilterIp IP filter
     */
    public String getFilterIp() {
        return this.FilterIp;
    }

    /**
     * Set IP filter
     * @param FilterIp IP filter
     */
    public void setFilterIp(String FilterIp) {
        this.FilterIp = FilterIp;
    }

    public DescribeListPacketFilterConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeListPacketFilterConfigRequest(DescribeListPacketFilterConfigRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.FilterInstanceId != null) {
            this.FilterInstanceId = new String(source.FilterInstanceId);
        }
        if (source.FilterIp != null) {
            this.FilterIp = new String(source.FilterIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "FilterInstanceId", this.FilterInstanceId);
        this.setParamSimple(map, prefix + "FilterIp", this.FilterIp);

    }
}

