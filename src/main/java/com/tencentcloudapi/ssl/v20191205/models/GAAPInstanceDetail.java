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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GAAPInstanceDetail extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Listener list
    */
    @SerializedName("ListenerList")
    @Expose
    private GAAPListenerDetail [] ListenerList;

    /**
    * Speed up the instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Listener list 
     * @return ListenerList Listener list
     */
    public GAAPListenerDetail [] getListenerList() {
        return this.ListenerList;
    }

    /**
     * Set Listener list
     * @param ListenerList Listener list
     */
    public void setListenerList(GAAPListenerDetail [] ListenerList) {
        this.ListenerList = ListenerList;
    }

    /**
     * Get Speed up the instance name 
     * @return InstanceName Speed up the instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Speed up the instance name
     * @param InstanceName Speed up the instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    public GAAPInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GAAPInstanceDetail(GAAPInstanceDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ListenerList != null) {
            this.ListenerList = new GAAPListenerDetail[source.ListenerList.length];
            for (int i = 0; i < source.ListenerList.length; i++) {
                this.ListenerList[i] = new GAAPListenerDetail(source.ListenerList[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "ListenerList.", this.ListenerList);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}

