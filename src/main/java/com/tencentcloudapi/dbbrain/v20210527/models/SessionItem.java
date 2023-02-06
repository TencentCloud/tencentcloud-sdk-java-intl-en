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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SessionItem extends AbstractModel{

    /**
    * Access source
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * The number of active connections from the current access source
    */
    @SerializedName("ActiveConn")
    @Expose
    private String ActiveConn;

    /**
    * The total number of connections from the current access source
    */
    @SerializedName("AllConn")
    @Expose
    private Long AllConn;

    /**
     * Get Access source 
     * @return Ip Access source
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Access source
     * @param Ip Access source
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get The number of active connections from the current access source 
     * @return ActiveConn The number of active connections from the current access source
     */
    public String getActiveConn() {
        return this.ActiveConn;
    }

    /**
     * Set The number of active connections from the current access source
     * @param ActiveConn The number of active connections from the current access source
     */
    public void setActiveConn(String ActiveConn) {
        this.ActiveConn = ActiveConn;
    }

    /**
     * Get The total number of connections from the current access source 
     * @return AllConn The total number of connections from the current access source
     */
    public Long getAllConn() {
        return this.AllConn;
    }

    /**
     * Set The total number of connections from the current access source
     * @param AllConn The total number of connections from the current access source
     */
    public void setAllConn(Long AllConn) {
        this.AllConn = AllConn;
    }

    public SessionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionItem(SessionItem source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.ActiveConn != null) {
            this.ActiveConn = new String(source.ActiveConn);
        }
        if (source.AllConn != null) {
            this.AllConn = new Long(source.AllConn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "ActiveConn", this.ActiveConn);
        this.setParamSimple(map, prefix + "AllConn", this.AllConn);

    }
}

