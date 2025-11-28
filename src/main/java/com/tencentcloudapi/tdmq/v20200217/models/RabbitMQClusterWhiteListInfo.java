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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQClusterWhiteListInfo extends AbstractModel {

    /**
    * Deprecated.
    */
    @SerializedName("WhiteList")
    @Expose
    private String WhiteList;

    /**
    * Public network console allowlist.
    */
    @SerializedName("PublicControlConsoleWhiteList")
    @Expose
    private String PublicControlConsoleWhiteList;

    /**
    * Public network data flow allowlist.
    */
    @SerializedName("PublicDataStreamWhiteList")
    @Expose
    private String PublicDataStreamWhiteList;

    /**
    * 
    */
    @SerializedName("PublicControlConsoleWhiteListStatus")
    @Expose
    private String PublicControlConsoleWhiteListStatus;

    /**
    * 
    */
    @SerializedName("PublicDataStreamWhiteListStatus")
    @Expose
    private String PublicDataStreamWhiteListStatus;

    /**
     * Get Deprecated. 
     * @return WhiteList Deprecated.
     */
    public String getWhiteList() {
        return this.WhiteList;
    }

    /**
     * Set Deprecated.
     * @param WhiteList Deprecated.
     */
    public void setWhiteList(String WhiteList) {
        this.WhiteList = WhiteList;
    }

    /**
     * Get Public network console allowlist. 
     * @return PublicControlConsoleWhiteList Public network console allowlist.
     */
    public String getPublicControlConsoleWhiteList() {
        return this.PublicControlConsoleWhiteList;
    }

    /**
     * Set Public network console allowlist.
     * @param PublicControlConsoleWhiteList Public network console allowlist.
     */
    public void setPublicControlConsoleWhiteList(String PublicControlConsoleWhiteList) {
        this.PublicControlConsoleWhiteList = PublicControlConsoleWhiteList;
    }

    /**
     * Get Public network data flow allowlist. 
     * @return PublicDataStreamWhiteList Public network data flow allowlist.
     */
    public String getPublicDataStreamWhiteList() {
        return this.PublicDataStreamWhiteList;
    }

    /**
     * Set Public network data flow allowlist.
     * @param PublicDataStreamWhiteList Public network data flow allowlist.
     */
    public void setPublicDataStreamWhiteList(String PublicDataStreamWhiteList) {
        this.PublicDataStreamWhiteList = PublicDataStreamWhiteList;
    }

    /**
     * Get  
     * @return PublicControlConsoleWhiteListStatus 
     */
    public String getPublicControlConsoleWhiteListStatus() {
        return this.PublicControlConsoleWhiteListStatus;
    }

    /**
     * Set 
     * @param PublicControlConsoleWhiteListStatus 
     */
    public void setPublicControlConsoleWhiteListStatus(String PublicControlConsoleWhiteListStatus) {
        this.PublicControlConsoleWhiteListStatus = PublicControlConsoleWhiteListStatus;
    }

    /**
     * Get  
     * @return PublicDataStreamWhiteListStatus 
     */
    public String getPublicDataStreamWhiteListStatus() {
        return this.PublicDataStreamWhiteListStatus;
    }

    /**
     * Set 
     * @param PublicDataStreamWhiteListStatus 
     */
    public void setPublicDataStreamWhiteListStatus(String PublicDataStreamWhiteListStatus) {
        this.PublicDataStreamWhiteListStatus = PublicDataStreamWhiteListStatus;
    }

    public RabbitMQClusterWhiteListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQClusterWhiteListInfo(RabbitMQClusterWhiteListInfo source) {
        if (source.WhiteList != null) {
            this.WhiteList = new String(source.WhiteList);
        }
        if (source.PublicControlConsoleWhiteList != null) {
            this.PublicControlConsoleWhiteList = new String(source.PublicControlConsoleWhiteList);
        }
        if (source.PublicDataStreamWhiteList != null) {
            this.PublicDataStreamWhiteList = new String(source.PublicDataStreamWhiteList);
        }
        if (source.PublicControlConsoleWhiteListStatus != null) {
            this.PublicControlConsoleWhiteListStatus = new String(source.PublicControlConsoleWhiteListStatus);
        }
        if (source.PublicDataStreamWhiteListStatus != null) {
            this.PublicDataStreamWhiteListStatus = new String(source.PublicDataStreamWhiteListStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WhiteList", this.WhiteList);
        this.setParamSimple(map, prefix + "PublicControlConsoleWhiteList", this.PublicControlConsoleWhiteList);
        this.setParamSimple(map, prefix + "PublicDataStreamWhiteList", this.PublicDataStreamWhiteList);
        this.setParamSimple(map, prefix + "PublicControlConsoleWhiteListStatus", this.PublicControlConsoleWhiteListStatus);
        this.setParamSimple(map, prefix + "PublicDataStreamWhiteListStatus", this.PublicDataStreamWhiteListStatus);

    }
}

