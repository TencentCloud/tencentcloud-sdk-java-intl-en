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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceProfile extends AbstractModel {

    /**
    * Client device type. valid values: <li>iOS;</li> <li>Android;</li> <li>WebView.</li>.
    */
    @SerializedName("ClientType")
    @Expose
    private String ClientType;

    /**
    * The minimum value to determine a request as high-risk ranges from 1–99. the larger the value, the higher the request risk, and the closer it resembles a request initiated by a Bot client. the default value is 50, corresponding to high-risk for values 51–100.
    */
    @SerializedName("HighRiskMinScore")
    @Expose
    private Long HighRiskMinScore;

    /**
    * Handling method for high-risk requests. valid values for SecurityAction Name: <li>Deny: block;</li> <li>Monitor: observation;</li> <li>Redirect: redirection;</li> <li>Challenge: Challenge.</li> default value: Monitor.
    */
    @SerializedName("HighRiskRequestAction")
    @Expose
    private SecurityAction HighRiskRequestAction;

    /**
    * Specifies the minimum value to determine a request as medium-risk. value range: 1–99. the larger the value, the higher the request risk, resembling requests initiated by a Bot client. default value: 15, corresponding to medium-risk for values 16–50.
    */
    @SerializedName("MediumRiskMinScore")
    @Expose
    private Long MediumRiskMinScore;

    /**
    * Handling method for medium-risk requests. SecurityAction Name parameter supports: <li>Deny: block;</li> <li>Monitor: observe;</li> <li>Redirect: Redirect;</li> <li>Challenge: Challenge.</li> default value is Monitor.
    */
    @SerializedName("MediumRiskRequestAction")
    @Expose
    private SecurityAction MediumRiskRequestAction;

    /**
     * Get Client device type. valid values: <li>iOS;</li> <li>Android;</li> <li>WebView.</li>. 
     * @return ClientType Client device type. valid values: <li>iOS;</li> <li>Android;</li> <li>WebView.</li>.
     */
    public String getClientType() {
        return this.ClientType;
    }

    /**
     * Set Client device type. valid values: <li>iOS;</li> <li>Android;</li> <li>WebView.</li>.
     * @param ClientType Client device type. valid values: <li>iOS;</li> <li>Android;</li> <li>WebView.</li>.
     */
    public void setClientType(String ClientType) {
        this.ClientType = ClientType;
    }

    /**
     * Get The minimum value to determine a request as high-risk ranges from 1–99. the larger the value, the higher the request risk, and the closer it resembles a request initiated by a Bot client. the default value is 50, corresponding to high-risk for values 51–100. 
     * @return HighRiskMinScore The minimum value to determine a request as high-risk ranges from 1–99. the larger the value, the higher the request risk, and the closer it resembles a request initiated by a Bot client. the default value is 50, corresponding to high-risk for values 51–100.
     */
    public Long getHighRiskMinScore() {
        return this.HighRiskMinScore;
    }

    /**
     * Set The minimum value to determine a request as high-risk ranges from 1–99. the larger the value, the higher the request risk, and the closer it resembles a request initiated by a Bot client. the default value is 50, corresponding to high-risk for values 51–100.
     * @param HighRiskMinScore The minimum value to determine a request as high-risk ranges from 1–99. the larger the value, the higher the request risk, and the closer it resembles a request initiated by a Bot client. the default value is 50, corresponding to high-risk for values 51–100.
     */
    public void setHighRiskMinScore(Long HighRiskMinScore) {
        this.HighRiskMinScore = HighRiskMinScore;
    }

    /**
     * Get Handling method for high-risk requests. valid values for SecurityAction Name: <li>Deny: block;</li> <li>Monitor: observation;</li> <li>Redirect: redirection;</li> <li>Challenge: Challenge.</li> default value: Monitor. 
     * @return HighRiskRequestAction Handling method for high-risk requests. valid values for SecurityAction Name: <li>Deny: block;</li> <li>Monitor: observation;</li> <li>Redirect: redirection;</li> <li>Challenge: Challenge.</li> default value: Monitor.
     */
    public SecurityAction getHighRiskRequestAction() {
        return this.HighRiskRequestAction;
    }

    /**
     * Set Handling method for high-risk requests. valid values for SecurityAction Name: <li>Deny: block;</li> <li>Monitor: observation;</li> <li>Redirect: redirection;</li> <li>Challenge: Challenge.</li> default value: Monitor.
     * @param HighRiskRequestAction Handling method for high-risk requests. valid values for SecurityAction Name: <li>Deny: block;</li> <li>Monitor: observation;</li> <li>Redirect: redirection;</li> <li>Challenge: Challenge.</li> default value: Monitor.
     */
    public void setHighRiskRequestAction(SecurityAction HighRiskRequestAction) {
        this.HighRiskRequestAction = HighRiskRequestAction;
    }

    /**
     * Get Specifies the minimum value to determine a request as medium-risk. value range: 1–99. the larger the value, the higher the request risk, resembling requests initiated by a Bot client. default value: 15, corresponding to medium-risk for values 16–50. 
     * @return MediumRiskMinScore Specifies the minimum value to determine a request as medium-risk. value range: 1–99. the larger the value, the higher the request risk, resembling requests initiated by a Bot client. default value: 15, corresponding to medium-risk for values 16–50.
     */
    public Long getMediumRiskMinScore() {
        return this.MediumRiskMinScore;
    }

    /**
     * Set Specifies the minimum value to determine a request as medium-risk. value range: 1–99. the larger the value, the higher the request risk, resembling requests initiated by a Bot client. default value: 15, corresponding to medium-risk for values 16–50.
     * @param MediumRiskMinScore Specifies the minimum value to determine a request as medium-risk. value range: 1–99. the larger the value, the higher the request risk, resembling requests initiated by a Bot client. default value: 15, corresponding to medium-risk for values 16–50.
     */
    public void setMediumRiskMinScore(Long MediumRiskMinScore) {
        this.MediumRiskMinScore = MediumRiskMinScore;
    }

    /**
     * Get Handling method for medium-risk requests. SecurityAction Name parameter supports: <li>Deny: block;</li> <li>Monitor: observe;</li> <li>Redirect: Redirect;</li> <li>Challenge: Challenge.</li> default value is Monitor. 
     * @return MediumRiskRequestAction Handling method for medium-risk requests. SecurityAction Name parameter supports: <li>Deny: block;</li> <li>Monitor: observe;</li> <li>Redirect: Redirect;</li> <li>Challenge: Challenge.</li> default value is Monitor.
     */
    public SecurityAction getMediumRiskRequestAction() {
        return this.MediumRiskRequestAction;
    }

    /**
     * Set Handling method for medium-risk requests. SecurityAction Name parameter supports: <li>Deny: block;</li> <li>Monitor: observe;</li> <li>Redirect: Redirect;</li> <li>Challenge: Challenge.</li> default value is Monitor.
     * @param MediumRiskRequestAction Handling method for medium-risk requests. SecurityAction Name parameter supports: <li>Deny: block;</li> <li>Monitor: observe;</li> <li>Redirect: Redirect;</li> <li>Challenge: Challenge.</li> default value is Monitor.
     */
    public void setMediumRiskRequestAction(SecurityAction MediumRiskRequestAction) {
        this.MediumRiskRequestAction = MediumRiskRequestAction;
    }

    public DeviceProfile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceProfile(DeviceProfile source) {
        if (source.ClientType != null) {
            this.ClientType = new String(source.ClientType);
        }
        if (source.HighRiskMinScore != null) {
            this.HighRiskMinScore = new Long(source.HighRiskMinScore);
        }
        if (source.HighRiskRequestAction != null) {
            this.HighRiskRequestAction = new SecurityAction(source.HighRiskRequestAction);
        }
        if (source.MediumRiskMinScore != null) {
            this.MediumRiskMinScore = new Long(source.MediumRiskMinScore);
        }
        if (source.MediumRiskRequestAction != null) {
            this.MediumRiskRequestAction = new SecurityAction(source.MediumRiskRequestAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientType", this.ClientType);
        this.setParamSimple(map, prefix + "HighRiskMinScore", this.HighRiskMinScore);
        this.setParamObj(map, prefix + "HighRiskRequestAction.", this.HighRiskRequestAction);
        this.setParamSimple(map, prefix + "MediumRiskMinScore", this.MediumRiskMinScore);
        this.setParamObj(map, prefix + "MediumRiskRequestAction.", this.MediumRiskRequestAction);

    }
}

