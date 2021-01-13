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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAllNamespacesResponse extends AbstractModel{

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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "QceNamespaces.", this.QceNamespaces);
        this.setParamObj(map, prefix + "CustomNamespaces.", this.CustomNamespaces);
        this.setParamArrayObj(map, prefix + "QceNamespacesNew.", this.QceNamespacesNew);
        this.setParamArrayObj(map, prefix + "CustomNamespacesNew.", this.CustomNamespacesNew);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

