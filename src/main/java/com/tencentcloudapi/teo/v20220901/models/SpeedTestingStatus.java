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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpeedTestingStatus extends AbstractModel{

    /**
    * The URL.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Whether the URL uses HTTPS.
    */
    @SerializedName("Tls")
    @Expose
    private Boolean Tls;

    /**
    * Creation time of the task.
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * The task status. Values:
<li>`200`: The task completed.</li>
<li>`100`: The task is running.</li>
<li>`503`: The task failed./li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * The user agent.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UA")
    @Expose
    private String UA;

    /**
    * The network environment.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Connectivity")
    @Expose
    private String Connectivity;

    /**
    * Whether the URL is reachable. Values:
<li>`true`: Yes</li>
<li>`false`: No</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Reachable")
    @Expose
    private Boolean Reachable;

    /**
    * Whether the URL connection timed out. Values:
<li>`true`: Yes</li>
<li>`false`: No</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimedOut")
    @Expose
    private Boolean TimedOut;

    /**
     * Get The URL. 
     * @return Url The URL.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set The URL.
     * @param Url The URL.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Whether the URL uses HTTPS. 
     * @return Tls Whether the URL uses HTTPS.
     */
    public Boolean getTls() {
        return this.Tls;
    }

    /**
     * Set Whether the URL uses HTTPS.
     * @param Tls Whether the URL uses HTTPS.
     */
    public void setTls(Boolean Tls) {
        this.Tls = Tls;
    }

    /**
     * Get Creation time of the task. 
     * @return CreatedOn Creation time of the task.
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set Creation time of the task.
     * @param CreatedOn Creation time of the task.
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get The task status. Values:
<li>`200`: The task completed.</li>
<li>`100`: The task is running.</li>
<li>`503`: The task failed./li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StatusCode The task status. Values:
<li>`200`: The task completed.</li>
<li>`100`: The task is running.</li>
<li>`503`: The task failed./li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set The task status. Values:
<li>`200`: The task completed.</li>
<li>`100`: The task is running.</li>
<li>`503`: The task failed./li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StatusCode The task status. Values:
<li>`200`: The task completed.</li>
<li>`100`: The task is running.</li>
<li>`503`: The task failed./li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get The user agent.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UA The user agent.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUA() {
        return this.UA;
    }

    /**
     * Set The user agent.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UA The user agent.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUA(String UA) {
        this.UA = UA;
    }

    /**
     * Get The network environment.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Connectivity The network environment.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConnectivity() {
        return this.Connectivity;
    }

    /**
     * Set The network environment.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Connectivity The network environment.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConnectivity(String Connectivity) {
        this.Connectivity = Connectivity;
    }

    /**
     * Get Whether the URL is reachable. Values:
<li>`true`: Yes</li>
<li>`false`: No</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Reachable Whether the URL is reachable. Values:
<li>`true`: Yes</li>
<li>`false`: No</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getReachable() {
        return this.Reachable;
    }

    /**
     * Set Whether the URL is reachable. Values:
<li>`true`: Yes</li>
<li>`false`: No</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Reachable Whether the URL is reachable. Values:
<li>`true`: Yes</li>
<li>`false`: No</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReachable(Boolean Reachable) {
        this.Reachable = Reachable;
    }

    /**
     * Get Whether the URL connection timed out. Values:
<li>`true`: Yes</li>
<li>`false`: No</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TimedOut Whether the URL connection timed out. Values:
<li>`true`: Yes</li>
<li>`false`: No</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getTimedOut() {
        return this.TimedOut;
    }

    /**
     * Set Whether the URL connection timed out. Values:
<li>`true`: Yes</li>
<li>`false`: No</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TimedOut Whether the URL connection timed out. Values:
<li>`true`: Yes</li>
<li>`false`: No</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimedOut(Boolean TimedOut) {
        this.TimedOut = TimedOut;
    }

    public SpeedTestingStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpeedTestingStatus(SpeedTestingStatus source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Tls != null) {
            this.Tls = new Boolean(source.Tls);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.UA != null) {
            this.UA = new String(source.UA);
        }
        if (source.Connectivity != null) {
            this.Connectivity = new String(source.Connectivity);
        }
        if (source.Reachable != null) {
            this.Reachable = new Boolean(source.Reachable);
        }
        if (source.TimedOut != null) {
            this.TimedOut = new Boolean(source.TimedOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Tls", this.Tls);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "UA", this.UA);
        this.setParamSimple(map, prefix + "Connectivity", this.Connectivity);
        this.setParamSimple(map, prefix + "Reachable", this.Reachable);
        this.setParamSimple(map, prefix + "TimedOut", this.TimedOut);

    }
}

