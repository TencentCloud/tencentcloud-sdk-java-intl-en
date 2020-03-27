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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDirectConnectTunnelsRequest extends AbstractModel{

    /**
    * Filter conditions:
This parameter does not support specifying `DirectConnectTunnelIds` and `Filters` at the same time.
<li> direct-connect-tunnel-name: Dedicated tunnel name.</li>
<li> direct-connect-tunnel-id: Dedicated tunnel instance ID, such as `dcx-abcdefgh`.</li>
<li>direct-connect-id: Connection instance ID, such as `dc-abcdefgh`.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Array of dedicated tunnel IDs.
    */
    @SerializedName("DirectConnectTunnelIds")
    @Expose
    private String [] DirectConnectTunnelIds;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Filter conditions:
This parameter does not support specifying `DirectConnectTunnelIds` and `Filters` at the same time.
<li> direct-connect-tunnel-name: Dedicated tunnel name.</li>
<li> direct-connect-tunnel-id: Dedicated tunnel instance ID, such as `dcx-abcdefgh`.</li>
<li>direct-connect-id: Connection instance ID, such as `dc-abcdefgh`.</li> 
     * @return Filters Filter conditions:
This parameter does not support specifying `DirectConnectTunnelIds` and `Filters` at the same time.
<li> direct-connect-tunnel-name: Dedicated tunnel name.</li>
<li> direct-connect-tunnel-id: Dedicated tunnel instance ID, such as `dcx-abcdefgh`.</li>
<li>direct-connect-id: Connection instance ID, such as `dc-abcdefgh`.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions:
This parameter does not support specifying `DirectConnectTunnelIds` and `Filters` at the same time.
<li> direct-connect-tunnel-name: Dedicated tunnel name.</li>
<li> direct-connect-tunnel-id: Dedicated tunnel instance ID, such as `dcx-abcdefgh`.</li>
<li>direct-connect-id: Connection instance ID, such as `dc-abcdefgh`.</li>
     * @param Filters Filter conditions:
This parameter does not support specifying `DirectConnectTunnelIds` and `Filters` at the same time.
<li> direct-connect-tunnel-name: Dedicated tunnel name.</li>
<li> direct-connect-tunnel-id: Dedicated tunnel instance ID, such as `dcx-abcdefgh`.</li>
<li>direct-connect-id: Connection instance ID, such as `dc-abcdefgh`.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Array of dedicated tunnel IDs. 
     * @return DirectConnectTunnelIds Array of dedicated tunnel IDs.
     */
    public String [] getDirectConnectTunnelIds() {
        return this.DirectConnectTunnelIds;
    }

    /**
     * Set Array of dedicated tunnel IDs.
     * @param DirectConnectTunnelIds Array of dedicated tunnel IDs.
     */
    public void setDirectConnectTunnelIds(String [] DirectConnectTunnelIds) {
        this.DirectConnectTunnelIds = DirectConnectTunnelIds;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100.
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "DirectConnectTunnelIds.", this.DirectConnectTunnelIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

