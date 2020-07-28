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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateHTTPListenerRequest extends AbstractModel{

    /**
    * Listener name
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * Listener port, which is based on the listeners of same transport layer protocol (TCP or UDP). The port must be unique.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Connection ID, which cannot be set together with `GroupId` at the same time. A listener will be created for the corresponding connection.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Connection group ID, which cannot be set together with `ProxyId` at the same time. A listener will be created for the corresponding connection group.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get Listener name 
     * @return ListenerName Listener name
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set Listener name
     * @param ListenerName Listener name
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get Listener port, which is based on the listeners of same transport layer protocol (TCP or UDP). The port must be unique. 
     * @return Port Listener port, which is based on the listeners of same transport layer protocol (TCP or UDP). The port must be unique.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Listener port, which is based on the listeners of same transport layer protocol (TCP or UDP). The port must be unique.
     * @param Port Listener port, which is based on the listeners of same transport layer protocol (TCP or UDP). The port must be unique.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Connection ID, which cannot be set together with `GroupId` at the same time. A listener will be created for the corresponding connection. 
     * @return ProxyId Connection ID, which cannot be set together with `GroupId` at the same time. A listener will be created for the corresponding connection.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Connection ID, which cannot be set together with `GroupId` at the same time. A listener will be created for the corresponding connection.
     * @param ProxyId Connection ID, which cannot be set together with `GroupId` at the same time. A listener will be created for the corresponding connection.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Connection group ID, which cannot be set together with `ProxyId` at the same time. A listener will be created for the corresponding connection group. 
     * @return GroupId Connection group ID, which cannot be set together with `ProxyId` at the same time. A listener will be created for the corresponding connection group.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Connection group ID, which cannot be set together with `ProxyId` at the same time. A listener will be created for the corresponding connection group.
     * @param GroupId Connection group ID, which cannot be set together with `ProxyId` at the same time. A listener will be created for the corresponding connection group.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

