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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebUIInfo extends AbstractModel {

    /**
    * <p>Access address, which may be left empty.</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>WebUI status. Valid values:<br>-1: indicates that the current service does not have WebUI;<br>0: indicates that the current service has WebUI but does not have the KNOX service installed;<br>1: indicates that the current service has WebUI and has the KNOX service installed, but it does not have public network access enabled for the KNOX service;<br>2: indicates that the current service has WebUI, has the KNOX service installed, and has public network access enabled.</p>
    */
    @SerializedName("WebUIStatus")
    @Expose
    private Long WebUIStatus;

    /**
    * <p>Service name.</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
     * Get <p>Access address, which may be left empty.</p> 
     * @return Url <p>Access address, which may be left empty.</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>Access address, which may be left empty.</p>
     * @param Url <p>Access address, which may be left empty.</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>WebUI status. Valid values:<br>-1: indicates that the current service does not have WebUI;<br>0: indicates that the current service has WebUI but does not have the KNOX service installed;<br>1: indicates that the current service has WebUI and has the KNOX service installed, but it does not have public network access enabled for the KNOX service;<br>2: indicates that the current service has WebUI, has the KNOX service installed, and has public network access enabled.</p> 
     * @return WebUIStatus <p>WebUI status. Valid values:<br>-1: indicates that the current service does not have WebUI;<br>0: indicates that the current service has WebUI but does not have the KNOX service installed;<br>1: indicates that the current service has WebUI and has the KNOX service installed, but it does not have public network access enabled for the KNOX service;<br>2: indicates that the current service has WebUI, has the KNOX service installed, and has public network access enabled.</p>
     */
    public Long getWebUIStatus() {
        return this.WebUIStatus;
    }

    /**
     * Set <p>WebUI status. Valid values:<br>-1: indicates that the current service does not have WebUI;<br>0: indicates that the current service has WebUI but does not have the KNOX service installed;<br>1: indicates that the current service has WebUI and has the KNOX service installed, but it does not have public network access enabled for the KNOX service;<br>2: indicates that the current service has WebUI, has the KNOX service installed, and has public network access enabled.</p>
     * @param WebUIStatus <p>WebUI status. Valid values:<br>-1: indicates that the current service does not have WebUI;<br>0: indicates that the current service has WebUI but does not have the KNOX service installed;<br>1: indicates that the current service has WebUI and has the KNOX service installed, but it does not have public network access enabled for the KNOX service;<br>2: indicates that the current service has WebUI, has the KNOX service installed, and has public network access enabled.</p>
     */
    public void setWebUIStatus(Long WebUIStatus) {
        this.WebUIStatus = WebUIStatus;
    }

    /**
     * Get <p>Service name.</p> 
     * @return ServiceName <p>Service name.</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>Service name.</p>
     * @param ServiceName <p>Service name.</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    public WebUIInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebUIInfo(WebUIInfo source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.WebUIStatus != null) {
            this.WebUIStatus = new Long(source.WebUIStatus);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "WebUIStatus", this.WebUIStatus);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);

    }
}

