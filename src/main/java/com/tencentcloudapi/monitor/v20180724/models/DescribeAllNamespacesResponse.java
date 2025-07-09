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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAllNamespacesResponse extends AbstractModel {

    /**
    * Alarm policy type of Tencent Cloud service (disused)
    */
    @SerializedName("QceNamespaces")
    @Expose
    private CommonNamespace QceNamespaces;

    /**
    * Other alarm policy type (disused)
    */
    @SerializedName("CustomNamespaces")
    @Expose
    private CommonNamespace CustomNamespaces;

    /**
    * Alarm policy type of Tencent Cloud service
    */
    @SerializedName("QceNamespacesNew")
    @Expose
    private CommonNamespace [] QceNamespacesNew;

    /**
    * Other alarm policy type (not supported currently)
    */
    @SerializedName("CustomNamespacesNew")
    @Expose
    private CommonNamespace [] CustomNamespacesNew;

    /**
    * General alarm policy type, including TAPM, RUM, and CAT.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CommonNamespaces")
    @Expose
    private CommonNamespaceNew [] CommonNamespaces;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Alarm policy type of Tencent Cloud service (disused) 
     * @return QceNamespaces Alarm policy type of Tencent Cloud service (disused)
     */
    public CommonNamespace getQceNamespaces() {
        return this.QceNamespaces;
    }

    /**
     * Set Alarm policy type of Tencent Cloud service (disused)
     * @param QceNamespaces Alarm policy type of Tencent Cloud service (disused)
     */
    public void setQceNamespaces(CommonNamespace QceNamespaces) {
        this.QceNamespaces = QceNamespaces;
    }

    /**
     * Get Other alarm policy type (disused) 
     * @return CustomNamespaces Other alarm policy type (disused)
     */
    public CommonNamespace getCustomNamespaces() {
        return this.CustomNamespaces;
    }

    /**
     * Set Other alarm policy type (disused)
     * @param CustomNamespaces Other alarm policy type (disused)
     */
    public void setCustomNamespaces(CommonNamespace CustomNamespaces) {
        this.CustomNamespaces = CustomNamespaces;
    }

    /**
     * Get Alarm policy type of Tencent Cloud service 
     * @return QceNamespacesNew Alarm policy type of Tencent Cloud service
     */
    public CommonNamespace [] getQceNamespacesNew() {
        return this.QceNamespacesNew;
    }

    /**
     * Set Alarm policy type of Tencent Cloud service
     * @param QceNamespacesNew Alarm policy type of Tencent Cloud service
     */
    public void setQceNamespacesNew(CommonNamespace [] QceNamespacesNew) {
        this.QceNamespacesNew = QceNamespacesNew;
    }

    /**
     * Get Other alarm policy type (not supported currently) 
     * @return CustomNamespacesNew Other alarm policy type (not supported currently)
     */
    public CommonNamespace [] getCustomNamespacesNew() {
        return this.CustomNamespacesNew;
    }

    /**
     * Set Other alarm policy type (not supported currently)
     * @param CustomNamespacesNew Other alarm policy type (not supported currently)
     */
    public void setCustomNamespacesNew(CommonNamespace [] CustomNamespacesNew) {
        this.CustomNamespacesNew = CustomNamespacesNew;
    }

    /**
     * Get General alarm policy type, including TAPM, RUM, and CAT.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CommonNamespaces General alarm policy type, including TAPM, RUM, and CAT.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CommonNamespaceNew [] getCommonNamespaces() {
        return this.CommonNamespaces;
    }

    /**
     * Set General alarm policy type, including TAPM, RUM, and CAT.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CommonNamespaces General alarm policy type, including TAPM, RUM, and CAT.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCommonNamespaces(CommonNamespaceNew [] CommonNamespaces) {
        this.CommonNamespaces = CommonNamespaces;
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

    public DescribeAllNamespacesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllNamespacesResponse(DescribeAllNamespacesResponse source) {
        if (source.QceNamespaces != null) {
            this.QceNamespaces = new CommonNamespace(source.QceNamespaces);
        }
        if (source.CustomNamespaces != null) {
            this.CustomNamespaces = new CommonNamespace(source.CustomNamespaces);
        }
        if (source.QceNamespacesNew != null) {
            this.QceNamespacesNew = new CommonNamespace[source.QceNamespacesNew.length];
            for (int i = 0; i < source.QceNamespacesNew.length; i++) {
                this.QceNamespacesNew[i] = new CommonNamespace(source.QceNamespacesNew[i]);
            }
        }
        if (source.CustomNamespacesNew != null) {
            this.CustomNamespacesNew = new CommonNamespace[source.CustomNamespacesNew.length];
            for (int i = 0; i < source.CustomNamespacesNew.length; i++) {
                this.CustomNamespacesNew[i] = new CommonNamespace(source.CustomNamespacesNew[i]);
            }
        }
        if (source.CommonNamespaces != null) {
            this.CommonNamespaces = new CommonNamespaceNew[source.CommonNamespaces.length];
            for (int i = 0; i < source.CommonNamespaces.length; i++) {
                this.CommonNamespaces[i] = new CommonNamespaceNew(source.CommonNamespaces[i]);
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
        this.setParamObj(map, prefix + "QceNamespaces.", this.QceNamespaces);
        this.setParamObj(map, prefix + "CustomNamespaces.", this.CustomNamespaces);
        this.setParamArrayObj(map, prefix + "QceNamespacesNew.", this.QceNamespacesNew);
        this.setParamArrayObj(map, prefix + "CustomNamespacesNew.", this.CustomNamespacesNew);
        this.setParamArrayObj(map, prefix + "CommonNamespaces.", this.CommonNamespaces);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

