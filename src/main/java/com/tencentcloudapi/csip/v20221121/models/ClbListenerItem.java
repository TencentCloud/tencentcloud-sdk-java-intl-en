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

public class ClbListenerItem extends AbstractModel {

    /**
    * <p>Listener ID.</p>
    */
    @SerializedName("ListenerID")
    @Expose
    private String ListenerID;

    /**
    * <p>Listener name</p>
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * <p>Protocol</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>Port</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get <p>Listener ID.</p> 
     * @return ListenerID <p>Listener ID.</p>
     */
    public String getListenerID() {
        return this.ListenerID;
    }

    /**
     * Set <p>Listener ID.</p>
     * @param ListenerID <p>Listener ID.</p>
     */
    public void setListenerID(String ListenerID) {
        this.ListenerID = ListenerID;
    }

    /**
     * Get <p>Listener name</p> 
     * @return ListenerName <p>Listener name</p>
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set <p>Listener name</p>
     * @param ListenerName <p>Listener name</p>
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get <p>Protocol</p> 
     * @return Protocol <p>Protocol</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>Protocol</p>
     * @param Protocol <p>Protocol</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>Port</p> 
     * @return Port <p>Port</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>Port</p>
     * @param Port <p>Port</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ClbListenerItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClbListenerItem(ClbListenerItem source) {
        if (source.ListenerID != null) {
            this.ListenerID = new String(source.ListenerID);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerID", this.ListenerID);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

