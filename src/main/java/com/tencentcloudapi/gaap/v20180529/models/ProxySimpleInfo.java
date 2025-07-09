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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxySimpleInfo extends AbstractModel {

    /**
    * Connection ID
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Connection name
    */
    @SerializedName("ProxyName")
    @Expose
    private String ProxyName;

    /**
    * Listener list
    */
    @SerializedName("ListenerList")
    @Expose
    private ListenerInfo [] ListenerList;

    /**
     * Get Connection ID 
     * @return ProxyId Connection ID
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Connection ID
     * @param ProxyId Connection ID
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Connection name 
     * @return ProxyName Connection name
     */
    public String getProxyName() {
        return this.ProxyName;
    }

    /**
     * Set Connection name
     * @param ProxyName Connection name
     */
    public void setProxyName(String ProxyName) {
        this.ProxyName = ProxyName;
    }

    /**
     * Get Listener list 
     * @return ListenerList Listener list
     */
    public ListenerInfo [] getListenerList() {
        return this.ListenerList;
    }

    /**
     * Set Listener list
     * @param ListenerList Listener list
     */
    public void setListenerList(ListenerInfo [] ListenerList) {
        this.ListenerList = ListenerList;
    }

    public ProxySimpleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxySimpleInfo(ProxySimpleInfo source) {
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.ProxyName != null) {
            this.ProxyName = new String(source.ProxyName);
        }
        if (source.ListenerList != null) {
            this.ListenerList = new ListenerInfo[source.ListenerList.length];
            for (int i = 0; i < source.ListenerList.length; i++) {
                this.ListenerList[i] = new ListenerInfo(source.ListenerList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "ProxyName", this.ProxyName);
        this.setParamArrayObj(map, prefix + "ListenerList.", this.ListenerList);

    }
}

