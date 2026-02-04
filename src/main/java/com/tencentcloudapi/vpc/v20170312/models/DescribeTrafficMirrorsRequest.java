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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrafficMirrorsRequest extends AbstractModel {

    /**
    * Collection of traffic mirroring instance IDs.
    */
    @SerializedName("TrafficMirrorIds")
    @Expose
    private String [] TrafficMirrorIds;

    /**
    * Traffic mirroring query filtering and adjustment.
vpc-id: VPC instance ID, for example: vpc-f49l6u0z.
traffic-mirror-id: traffic mirroring instance ID.
Traffic-Mirror-Name: traffic mirroring name.
tag-key: filters according to the tag key.
    */
    @SerializedName("Filters")
    @Expose
    private Filter Filters;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returns. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Collection of traffic mirroring instance IDs. 
     * @return TrafficMirrorIds Collection of traffic mirroring instance IDs.
     */
    public String [] getTrafficMirrorIds() {
        return this.TrafficMirrorIds;
    }

    /**
     * Set Collection of traffic mirroring instance IDs.
     * @param TrafficMirrorIds Collection of traffic mirroring instance IDs.
     */
    public void setTrafficMirrorIds(String [] TrafficMirrorIds) {
        this.TrafficMirrorIds = TrafficMirrorIds;
    }

    /**
     * Get Traffic mirroring query filtering and adjustment.
vpc-id: VPC instance ID, for example: vpc-f49l6u0z.
traffic-mirror-id: traffic mirroring instance ID.
Traffic-Mirror-Name: traffic mirroring name.
tag-key: filters according to the tag key. 
     * @return Filters Traffic mirroring query filtering and adjustment.
vpc-id: VPC instance ID, for example: vpc-f49l6u0z.
traffic-mirror-id: traffic mirroring instance ID.
Traffic-Mirror-Name: traffic mirroring name.
tag-key: filters according to the tag key.
     */
    public Filter getFilters() {
        return this.Filters;
    }

    /**
     * Set Traffic mirroring query filtering and adjustment.
vpc-id: VPC instance ID, for example: vpc-f49l6u0z.
traffic-mirror-id: traffic mirroring instance ID.
Traffic-Mirror-Name: traffic mirroring name.
tag-key: filters according to the tag key.
     * @param Filters Traffic mirroring query filtering and adjustment.
vpc-id: VPC instance ID, for example: vpc-f49l6u0z.
traffic-mirror-id: traffic mirroring instance ID.
Traffic-Mirror-Name: traffic mirroring name.
tag-key: filters according to the tag key.
     */
    public void setFilters(Filter Filters) {
        this.Filters = Filters;
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
     * Get Number of returns. Default value: 20. Maximum value: 100. 
     * @return Limit Number of returns. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returns. Default value: 20. Maximum value: 100.
     * @param Limit Number of returns. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeTrafficMirrorsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrafficMirrorsRequest(DescribeTrafficMirrorsRequest source) {
        if (source.TrafficMirrorIds != null) {
            this.TrafficMirrorIds = new String[source.TrafficMirrorIds.length];
            for (int i = 0; i < source.TrafficMirrorIds.length; i++) {
                this.TrafficMirrorIds[i] = new String(source.TrafficMirrorIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter(source.Filters);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TrafficMirrorIds.", this.TrafficMirrorIds);
        this.setParamObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

