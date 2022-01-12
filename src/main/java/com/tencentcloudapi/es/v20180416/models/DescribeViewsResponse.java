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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeViewsResponse extends AbstractModel{

    /**
    * Cluster view
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ClusterView")
    @Expose
    private ClusterView ClusterView;

    /**
    * Node view
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("NodesView")
    @Expose
    private NodeView [] NodesView;

    /**
    * Kibana view
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("KibanasView")
    @Expose
    private KibanaView [] KibanasView;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Cluster view
Note: This field may return `null`, indicating that no valid value was found. 
     * @return ClusterView Cluster view
Note: This field may return `null`, indicating that no valid value was found.
     */
    public ClusterView getClusterView() {
        return this.ClusterView;
    }

    /**
     * Set Cluster view
Note: This field may return `null`, indicating that no valid value was found.
     * @param ClusterView Cluster view
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setClusterView(ClusterView ClusterView) {
        this.ClusterView = ClusterView;
    }

    /**
     * Get Node view
Note: This field may return `null`, indicating that no valid value was found. 
     * @return NodesView Node view
Note: This field may return `null`, indicating that no valid value was found.
     */
    public NodeView [] getNodesView() {
        return this.NodesView;
    }

    /**
     * Set Node view
Note: This field may return `null`, indicating that no valid value was found.
     * @param NodesView Node view
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setNodesView(NodeView [] NodesView) {
        this.NodesView = NodesView;
    }

    /**
     * Get Kibana view
Note: This field may return `null`, indicating that no valid value was found. 
     * @return KibanasView Kibana view
Note: This field may return `null`, indicating that no valid value was found.
     */
    public KibanaView [] getKibanasView() {
        return this.KibanasView;
    }

    /**
     * Set Kibana view
Note: This field may return `null`, indicating that no valid value was found.
     * @param KibanasView Kibana view
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setKibanasView(KibanaView [] KibanasView) {
        this.KibanasView = KibanasView;
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

    public DescribeViewsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeViewsResponse(DescribeViewsResponse source) {
        if (source.ClusterView != null) {
            this.ClusterView = new ClusterView(source.ClusterView);
        }
        if (source.NodesView != null) {
            this.NodesView = new NodeView[source.NodesView.length];
            for (int i = 0; i < source.NodesView.length; i++) {
                this.NodesView[i] = new NodeView(source.NodesView[i]);
            }
        }
        if (source.KibanasView != null) {
            this.KibanasView = new KibanaView[source.KibanasView.length];
            for (int i = 0; i < source.KibanasView.length; i++) {
                this.KibanasView[i] = new KibanaView(source.KibanasView[i]);
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
        this.setParamObj(map, prefix + "ClusterView.", this.ClusterView);
        this.setParamArrayObj(map, prefix + "NodesView.", this.NodesView);
        this.setParamArrayObj(map, prefix + "KibanasView.", this.KibanasView);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

