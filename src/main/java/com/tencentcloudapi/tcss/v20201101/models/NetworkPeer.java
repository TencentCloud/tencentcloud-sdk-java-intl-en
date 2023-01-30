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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkPeer extends AbstractModel{

    /**
    * Object type:

Namespace: `NamespaceSelector`, which indicates that `NamespaceSelector` has a value.

Pod type: `PodSelector`, which indicates that both `NamespaceSelector` and `PodSelector` have values.

IP type: `IPBlock`, which indicates that only `IPBlock` has a value.
    */
    @SerializedName("PeerType")
    @Expose
    private String PeerType;

    /**
    * Namespace selector
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NamespaceSelector")
    @Expose
    private String NamespaceSelector;

    /**
    * Pod selector
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PodSelector")
    @Expose
    private String PodSelector;

    /**
    * IP selector
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IPBlock")
    @Expose
    private String IPBlock;

    /**
     * Get Object type:

Namespace: `NamespaceSelector`, which indicates that `NamespaceSelector` has a value.

Pod type: `PodSelector`, which indicates that both `NamespaceSelector` and `PodSelector` have values.

IP type: `IPBlock`, which indicates that only `IPBlock` has a value. 
     * @return PeerType Object type:

Namespace: `NamespaceSelector`, which indicates that `NamespaceSelector` has a value.

Pod type: `PodSelector`, which indicates that both `NamespaceSelector` and `PodSelector` have values.

IP type: `IPBlock`, which indicates that only `IPBlock` has a value.
     */
    public String getPeerType() {
        return this.PeerType;
    }

    /**
     * Set Object type:

Namespace: `NamespaceSelector`, which indicates that `NamespaceSelector` has a value.

Pod type: `PodSelector`, which indicates that both `NamespaceSelector` and `PodSelector` have values.

IP type: `IPBlock`, which indicates that only `IPBlock` has a value.
     * @param PeerType Object type:

Namespace: `NamespaceSelector`, which indicates that `NamespaceSelector` has a value.

Pod type: `PodSelector`, which indicates that both `NamespaceSelector` and `PodSelector` have values.

IP type: `IPBlock`, which indicates that only `IPBlock` has a value.
     */
    public void setPeerType(String PeerType) {
        this.PeerType = PeerType;
    }

    /**
     * Get Namespace selector
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NamespaceSelector Namespace selector
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNamespaceSelector() {
        return this.NamespaceSelector;
    }

    /**
     * Set Namespace selector
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NamespaceSelector Namespace selector
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNamespaceSelector(String NamespaceSelector) {
        this.NamespaceSelector = NamespaceSelector;
    }

    /**
     * Get Pod selector
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PodSelector Pod selector
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPodSelector() {
        return this.PodSelector;
    }

    /**
     * Set Pod selector
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PodSelector Pod selector
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPodSelector(String PodSelector) {
        this.PodSelector = PodSelector;
    }

    /**
     * Get IP selector
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IPBlock IP selector
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIPBlock() {
        return this.IPBlock;
    }

    /**
     * Set IP selector
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IPBlock IP selector
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIPBlock(String IPBlock) {
        this.IPBlock = IPBlock;
    }

    public NetworkPeer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkPeer(NetworkPeer source) {
        if (source.PeerType != null) {
            this.PeerType = new String(source.PeerType);
        }
        if (source.NamespaceSelector != null) {
            this.NamespaceSelector = new String(source.NamespaceSelector);
        }
        if (source.PodSelector != null) {
            this.PodSelector = new String(source.PodSelector);
        }
        if (source.IPBlock != null) {
            this.IPBlock = new String(source.IPBlock);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PeerType", this.PeerType);
        this.setParamSimple(map, prefix + "NamespaceSelector", this.NamespaceSelector);
        this.setParamSimple(map, prefix + "PodSelector", this.PodSelector);
        this.setParamSimple(map, prefix + "IPBlock", this.IPBlock);

    }
}

