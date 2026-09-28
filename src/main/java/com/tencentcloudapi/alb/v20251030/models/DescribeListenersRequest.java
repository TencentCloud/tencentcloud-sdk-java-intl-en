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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeListenersRequest extends AbstractModel {

    /**
    * Cloud Load Balancer instance ID, in the format of "alb-" followed by 8 alphanumeric characters.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Filter criteria list. Supports up to 20. Supports the following fields.
- **Protocol**: Protocol type
- **Tags**: Tag
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Listener ID list. ID format: lst- followed by 8 alphanumeric characters.
    */
    @SerializedName("ListenerIds")
    @Expose
    private String [] ListenerIds;

    /**
    * Maximum number of data records read this time.
Value: 1-100.
Default value: 20
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * Token for the next query. If it is empty, this queries page 1.
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
     * Get Cloud Load Balancer instance ID, in the format of "alb-" followed by 8 alphanumeric characters. 
     * @return LoadBalancerId Cloud Load Balancer instance ID, in the format of "alb-" followed by 8 alphanumeric characters.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set Cloud Load Balancer instance ID, in the format of "alb-" followed by 8 alphanumeric characters.
     * @param LoadBalancerId Cloud Load Balancer instance ID, in the format of "alb-" followed by 8 alphanumeric characters.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Filter criteria list. Supports up to 20. Supports the following fields.
- **Protocol**: Protocol type
- **Tags**: Tag 
     * @return Filters Filter criteria list. Supports up to 20. Supports the following fields.
- **Protocol**: Protocol type
- **Tags**: Tag
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria list. Supports up to 20. Supports the following fields.
- **Protocol**: Protocol type
- **Tags**: Tag
     * @param Filters Filter criteria list. Supports up to 20. Supports the following fields.
- **Protocol**: Protocol type
- **Tags**: Tag
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Listener ID list. ID format: lst- followed by 8 alphanumeric characters. 
     * @return ListenerIds Listener ID list. ID format: lst- followed by 8 alphanumeric characters.
     */
    public String [] getListenerIds() {
        return this.ListenerIds;
    }

    /**
     * Set Listener ID list. ID format: lst- followed by 8 alphanumeric characters.
     * @param ListenerIds Listener ID list. ID format: lst- followed by 8 alphanumeric characters.
     */
    public void setListenerIds(String [] ListenerIds) {
        this.ListenerIds = ListenerIds;
    }

    /**
     * Get Maximum number of data records read this time.
Value: 1-100.
Default value: 20 
     * @return MaxResults Maximum number of data records read this time.
Value: 1-100.
Default value: 20
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set Maximum number of data records read this time.
Value: 1-100.
Default value: 20
     * @param MaxResults Maximum number of data records read this time.
Value: 1-100.
Default value: 20
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get Token for the next query. If it is empty, this queries page 1. 
     * @return NextToken Token for the next query. If it is empty, this queries page 1.
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set Token for the next query. If it is empty, this queries page 1.
     * @param NextToken Token for the next query. If it is empty, this queries page 1.
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    public DescribeListenersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeListenersRequest(DescribeListenersRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.ListenerIds != null) {
            this.ListenerIds = new String[source.ListenerIds.length];
            for (int i = 0; i < source.ListenerIds.length; i++) {
                this.ListenerIds[i] = new String(source.ListenerIds[i]);
            }
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "ListenerIds.", this.ListenerIds);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);

    }
}

