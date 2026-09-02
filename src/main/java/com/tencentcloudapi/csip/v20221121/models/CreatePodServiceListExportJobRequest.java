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

public class CreatePodServiceListExportJobRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Cluster CA certificate MD5 (at least one of this and PodUniqueID is required)</p>
    */
    @SerializedName("ClusterCaMD5")
    @Expose
    private String ClusterCaMD5;

    /**
    * <p>Unique ID of the Pod (if passed, the Pod Association Service mode is used)<br>Supplemental description: Pass at least one of this parameter and ClusterCaMD5</p>
    */
    @SerializedName("PodUniqueID")
    @Expose
    private String PodUniqueID;

    /**
    * <p>Common filter criteria list. Supported filter fields:<br>Name: service name, fuzzy matching.<br>ServiceType: service type, exact matching. Values: ClusterIP, NodePort, LoadBalancer, ExternalName.<br>Namespace: namespace, exact matching.<br>SelectorLabel: Selector tag, fuzzy matching.</p>
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
    * <p>Export field list (export all fields if not specified)<br>Enumeration values:<br>Name: service name<br>ServiceType: service type (for example, LoadBalancer/ClusterIP)<br>Selector: Selector tag (format: key1=value1;key2=value2)<br>Namespace: namespace<br>CreateTime: creation time</p>
    */
    @SerializedName("ExportFields")
    @Expose
    private String [] ExportFields;

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Cluster CA certificate MD5 (at least one of this and PodUniqueID is required)</p> 
     * @return ClusterCaMD5 <p>Cluster CA certificate MD5 (at least one of this and PodUniqueID is required)</p>
     */
    public String getClusterCaMD5() {
        return this.ClusterCaMD5;
    }

    /**
     * Set <p>Cluster CA certificate MD5 (at least one of this and PodUniqueID is required)</p>
     * @param ClusterCaMD5 <p>Cluster CA certificate MD5 (at least one of this and PodUniqueID is required)</p>
     */
    public void setClusterCaMD5(String ClusterCaMD5) {
        this.ClusterCaMD5 = ClusterCaMD5;
    }

    /**
     * Get <p>Unique ID of the Pod (if passed, the Pod Association Service mode is used)<br>Supplemental description: Pass at least one of this parameter and ClusterCaMD5</p> 
     * @return PodUniqueID <p>Unique ID of the Pod (if passed, the Pod Association Service mode is used)<br>Supplemental description: Pass at least one of this parameter and ClusterCaMD5</p>
     */
    public String getPodUniqueID() {
        return this.PodUniqueID;
    }

    /**
     * Set <p>Unique ID of the Pod (if passed, the Pod Association Service mode is used)<br>Supplemental description: Pass at least one of this parameter and ClusterCaMD5</p>
     * @param PodUniqueID <p>Unique ID of the Pod (if passed, the Pod Association Service mode is used)<br>Supplemental description: Pass at least one of this parameter and ClusterCaMD5</p>
     */
    public void setPodUniqueID(String PodUniqueID) {
        this.PodUniqueID = PodUniqueID;
    }

    /**
     * Get <p>Common filter criteria list. Supported filter fields:<br>Name: service name, fuzzy matching.<br>ServiceType: service type, exact matching. Values: ClusterIP, NodePort, LoadBalancer, ExternalName.<br>Namespace: namespace, exact matching.<br>SelectorLabel: Selector tag, fuzzy matching.</p> 
     * @return Filter <p>Common filter criteria list. Supported filter fields:<br>Name: service name, fuzzy matching.<br>ServiceType: service type, exact matching. Values: ClusterIP, NodePort, LoadBalancer, ExternalName.<br>Namespace: namespace, exact matching.<br>SelectorLabel: Selector tag, fuzzy matching.</p>
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>Common filter criteria list. Supported filter fields:<br>Name: service name, fuzzy matching.<br>ServiceType: service type, exact matching. Values: ClusterIP, NodePort, LoadBalancer, ExternalName.<br>Namespace: namespace, exact matching.<br>SelectorLabel: Selector tag, fuzzy matching.</p>
     * @param Filter <p>Common filter criteria list. Supported filter fields:<br>Name: service name, fuzzy matching.<br>ServiceType: service type, exact matching. Values: ClusterIP, NodePort, LoadBalancer, ExternalName.<br>Namespace: namespace, exact matching.<br>SelectorLabel: Selector tag, fuzzy matching.</p>
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>Export field list (export all fields if not specified)<br>Enumeration values:<br>Name: service name<br>ServiceType: service type (for example, LoadBalancer/ClusterIP)<br>Selector: Selector tag (format: key1=value1;key2=value2)<br>Namespace: namespace<br>CreateTime: creation time</p> 
     * @return ExportFields <p>Export field list (export all fields if not specified)<br>Enumeration values:<br>Name: service name<br>ServiceType: service type (for example, LoadBalancer/ClusterIP)<br>Selector: Selector tag (format: key1=value1;key2=value2)<br>Namespace: namespace<br>CreateTime: creation time</p>
     */
    public String [] getExportFields() {
        return this.ExportFields;
    }

    /**
     * Set <p>Export field list (export all fields if not specified)<br>Enumeration values:<br>Name: service name<br>ServiceType: service type (for example, LoadBalancer/ClusterIP)<br>Selector: Selector tag (format: key1=value1;key2=value2)<br>Namespace: namespace<br>CreateTime: creation time</p>
     * @param ExportFields <p>Export field list (export all fields if not specified)<br>Enumeration values:<br>Name: service name<br>ServiceType: service type (for example, LoadBalancer/ClusterIP)<br>Selector: Selector tag (format: key1=value1;key2=value2)<br>Namespace: namespace<br>CreateTime: creation time</p>
     */
    public void setExportFields(String [] ExportFields) {
        this.ExportFields = ExportFields;
    }

    public CreatePodServiceListExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePodServiceListExportJobRequest(CreatePodServiceListExportJobRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.ClusterCaMD5 != null) {
            this.ClusterCaMD5 = new String(source.ClusterCaMD5);
        }
        if (source.PodUniqueID != null) {
            this.PodUniqueID = new String(source.PodUniqueID);
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
        if (source.ExportFields != null) {
            this.ExportFields = new String[source.ExportFields.length];
            for (int i = 0; i < source.ExportFields.length; i++) {
                this.ExportFields[i] = new String(source.ExportFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "ClusterCaMD5", this.ClusterCaMD5);
        this.setParamSimple(map, prefix + "PodUniqueID", this.PodUniqueID);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamArraySimple(map, prefix + "ExportFields.", this.ExportFields);

    }
}

