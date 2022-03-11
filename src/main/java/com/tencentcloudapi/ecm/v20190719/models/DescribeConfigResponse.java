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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConfigResponse extends AbstractModel{

    /**
    * Range of the network bandwidth disk size.
    */
    @SerializedName("NetworkStorageRange")
    @Expose
    private NetworkStorageRange NetworkStorageRange;

    /**
    * Image OS allowlist.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageWhiteSet")
    @Expose
    private String [] ImageWhiteSet;

    /**
    * Network quota information.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceNetworkLimitConfigs")
    @Expose
    private InstanceNetworkLimitConfig [] InstanceNetworkLimitConfigs;

    /**
    * Image quota information.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageLimits")
    @Expose
    private ImageLimitConfig ImageLimits;

    /**
    * Default IP direct access, used in scenarios with direct access parameters such as module creation and virtual machine purchase.
    */
    @SerializedName("DefaultIPDirect")
    @Expose
    private Boolean DefaultIPDirect;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Range of the network bandwidth disk size. 
     * @return NetworkStorageRange Range of the network bandwidth disk size.
     */
    public NetworkStorageRange getNetworkStorageRange() {
        return this.NetworkStorageRange;
    }

    /**
     * Set Range of the network bandwidth disk size.
     * @param NetworkStorageRange Range of the network bandwidth disk size.
     */
    public void setNetworkStorageRange(NetworkStorageRange NetworkStorageRange) {
        this.NetworkStorageRange = NetworkStorageRange;
    }

    /**
     * Get Image OS allowlist.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ImageWhiteSet Image OS allowlist.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getImageWhiteSet() {
        return this.ImageWhiteSet;
    }

    /**
     * Set Image OS allowlist.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ImageWhiteSet Image OS allowlist.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setImageWhiteSet(String [] ImageWhiteSet) {
        this.ImageWhiteSet = ImageWhiteSet;
    }

    /**
     * Get Network quota information.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InstanceNetworkLimitConfigs Network quota information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public InstanceNetworkLimitConfig [] getInstanceNetworkLimitConfigs() {
        return this.InstanceNetworkLimitConfigs;
    }

    /**
     * Set Network quota information.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InstanceNetworkLimitConfigs Network quota information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceNetworkLimitConfigs(InstanceNetworkLimitConfig [] InstanceNetworkLimitConfigs) {
        this.InstanceNetworkLimitConfigs = InstanceNetworkLimitConfigs;
    }

    /**
     * Get Image quota information.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ImageLimits Image quota information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ImageLimitConfig getImageLimits() {
        return this.ImageLimits;
    }

    /**
     * Set Image quota information.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ImageLimits Image quota information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setImageLimits(ImageLimitConfig ImageLimits) {
        this.ImageLimits = ImageLimits;
    }

    /**
     * Get Default IP direct access, used in scenarios with direct access parameters such as module creation and virtual machine purchase. 
     * @return DefaultIPDirect Default IP direct access, used in scenarios with direct access parameters such as module creation and virtual machine purchase.
     */
    public Boolean getDefaultIPDirect() {
        return this.DefaultIPDirect;
    }

    /**
     * Set Default IP direct access, used in scenarios with direct access parameters such as module creation and virtual machine purchase.
     * @param DefaultIPDirect Default IP direct access, used in scenarios with direct access parameters such as module creation and virtual machine purchase.
     */
    public void setDefaultIPDirect(Boolean DefaultIPDirect) {
        this.DefaultIPDirect = DefaultIPDirect;
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

    public DescribeConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigResponse(DescribeConfigResponse source) {
        if (source.NetworkStorageRange != null) {
            this.NetworkStorageRange = new NetworkStorageRange(source.NetworkStorageRange);
        }
        if (source.ImageWhiteSet != null) {
            this.ImageWhiteSet = new String[source.ImageWhiteSet.length];
            for (int i = 0; i < source.ImageWhiteSet.length; i++) {
                this.ImageWhiteSet[i] = new String(source.ImageWhiteSet[i]);
            }
        }
        if (source.InstanceNetworkLimitConfigs != null) {
            this.InstanceNetworkLimitConfigs = new InstanceNetworkLimitConfig[source.InstanceNetworkLimitConfigs.length];
            for (int i = 0; i < source.InstanceNetworkLimitConfigs.length; i++) {
                this.InstanceNetworkLimitConfigs[i] = new InstanceNetworkLimitConfig(source.InstanceNetworkLimitConfigs[i]);
            }
        }
        if (source.ImageLimits != null) {
            this.ImageLimits = new ImageLimitConfig(source.ImageLimits);
        }
        if (source.DefaultIPDirect != null) {
            this.DefaultIPDirect = new Boolean(source.DefaultIPDirect);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "NetworkStorageRange.", this.NetworkStorageRange);
        this.setParamArraySimple(map, prefix + "ImageWhiteSet.", this.ImageWhiteSet);
        this.setParamArrayObj(map, prefix + "InstanceNetworkLimitConfigs.", this.InstanceNetworkLimitConfigs);
        this.setParamObj(map, prefix + "ImageLimits.", this.ImageLimits);
        this.setParamSimple(map, prefix + "DefaultIPDirect", this.DefaultIPDirect);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

