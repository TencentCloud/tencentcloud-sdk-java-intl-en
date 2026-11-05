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
    * <p>Client device type. Valid values: <li>iOS;</li><li>Android;</li><li>WebView;</li><li>WeChatMiniProgram.</li></p>
    */
    @SerializedName("ClientType")
    @Expose
    private String ClientType;

    /**
    * <p>Minimum risk score for high-risk requests. A request is considered high-risk when its score is equal to or greater than this value.</p><p>Value range: [2, 99]</p><p>Default value: 50</p>
    */
    @SerializedName("HighRiskMinScore")
    @Expose
    private Long HighRiskMinScore;

    /**
    * <p>Handling method for high-risk requests. Supported values for the Name parameter of SecurityAction: <li>Deny: Block;</li><li>Monitor: Observe;</li><li>Redirect: Redirection;</li><li>Challenge: Challenge.</li>Default value: Monitor.</p>
    */
    @SerializedName("HighRiskRequestAction")
    @Expose
    private SecurityAction HighRiskRequestAction;

    /**
    * <p>The minimum risk score for a medium-risk request. When the score is equal to or greater than this value and less than HighRiskMinScore, it is determined as medium-risk. When it is below this value, it is determined as low risk.</p><p>Value range: [1, 98]</p><p>Default value: 15</p>
    */
    @SerializedName("MediumRiskMinScore")
    @Expose
    private Long MediumRiskMinScore;

    /**
    * <p>Handling method for medium risk requests. Supported values for the Name of SecurityAction: <li>Deny: block;</li><li>Monitor: monitor;</li><li>Redirect: redirect;</li><li>Challenge: challenge.</li>Default value: Monitor.</p>
    */
    @SerializedName("MediumRiskRequestAction")
    @Expose
    private SecurityAction MediumRiskRequestAction;

    /**
     * Get <p>Client device type. Valid values: <li>iOS;</li><li>Android;</li><li>WebView;</li><li>WeChatMiniProgram.</li></p> 
     * @return ClientType <p>Client device type. Valid values: <li>iOS;</li><li>Android;</li><li>WebView;</li><li>WeChatMiniProgram.</li></p>
     */
    public String getClientType() {
        return this.ClientType;
    }

    /**
     * Set <p>Client device type. Valid values: <li>iOS;</li><li>Android;</li><li>WebView;</li><li>WeChatMiniProgram.</li></p>
     * @param ClientType <p>Client device type. Valid values: <li>iOS;</li><li>Android;</li><li>WebView;</li><li>WeChatMiniProgram.</li></p>
     */
    public void setClientType(String ClientType) {
        this.ClientType = ClientType;
    }

    /**
     * Get <p>Minimum risk score for high-risk requests. A request is considered high-risk when its score is equal to or greater than this value.</p><p>Value range: [2, 99]</p><p>Default value: 50</p> 
     * @return HighRiskMinScore <p>Minimum risk score for high-risk requests. A request is considered high-risk when its score is equal to or greater than this value.</p><p>Value range: [2, 99]</p><p>Default value: 50</p>
     */
    public Long getHighRiskMinScore() {
        return this.HighRiskMinScore;
    }

    /**
     * Set <p>Minimum risk score for high-risk requests. A request is considered high-risk when its score is equal to or greater than this value.</p><p>Value range: [2, 99]</p><p>Default value: 50</p>
     * @param HighRiskMinScore <p>Minimum risk score for high-risk requests. A request is considered high-risk when its score is equal to or greater than this value.</p><p>Value range: [2, 99]</p><p>Default value: 50</p>
     */
    public void setHighRiskMinScore(Long HighRiskMinScore) {
        this.HighRiskMinScore = HighRiskMinScore;
    }

    /**
     * Get <p>Handling method for high-risk requests. Supported values for the Name parameter of SecurityAction: <li>Deny: Block;</li><li>Monitor: Observe;</li><li>Redirect: Redirection;</li><li>Challenge: Challenge.</li>Default value: Monitor.</p> 
     * @return HighRiskRequestAction <p>Handling method for high-risk requests. Supported values for the Name parameter of SecurityAction: <li>Deny: Block;</li><li>Monitor: Observe;</li><li>Redirect: Redirection;</li><li>Challenge: Challenge.</li>Default value: Monitor.</p>
     */
    public SecurityAction getHighRiskRequestAction() {
        return this.HighRiskRequestAction;
    }

    /**
     * Set <p>Handling method for high-risk requests. Supported values for the Name parameter of SecurityAction: <li>Deny: Block;</li><li>Monitor: Observe;</li><li>Redirect: Redirection;</li><li>Challenge: Challenge.</li>Default value: Monitor.</p>
     * @param HighRiskRequestAction <p>Handling method for high-risk requests. Supported values for the Name parameter of SecurityAction: <li>Deny: Block;</li><li>Monitor: Observe;</li><li>Redirect: Redirection;</li><li>Challenge: Challenge.</li>Default value: Monitor.</p>
     */
    public void setHighRiskRequestAction(SecurityAction HighRiskRequestAction) {
        this.HighRiskRequestAction = HighRiskRequestAction;
    }

    /**
     * Get <p>The minimum risk score for a medium-risk request. When the score is equal to or greater than this value and less than HighRiskMinScore, it is determined as medium-risk. When it is below this value, it is determined as low risk.</p><p>Value range: [1, 98]</p><p>Default value: 15</p> 
     * @return MediumRiskMinScore <p>The minimum risk score for a medium-risk request. When the score is equal to or greater than this value and less than HighRiskMinScore, it is determined as medium-risk. When it is below this value, it is determined as low risk.</p><p>Value range: [1, 98]</p><p>Default value: 15</p>
     */
    public Long getMediumRiskMinScore() {
        return this.MediumRiskMinScore;
    }

    /**
     * Set <p>The minimum risk score for a medium-risk request. When the score is equal to or greater than this value and less than HighRiskMinScore, it is determined as medium-risk. When it is below this value, it is determined as low risk.</p><p>Value range: [1, 98]</p><p>Default value: 15</p>
     * @param MediumRiskMinScore <p>The minimum risk score for a medium-risk request. When the score is equal to or greater than this value and less than HighRiskMinScore, it is determined as medium-risk. When it is below this value, it is determined as low risk.</p><p>Value range: [1, 98]</p><p>Default value: 15</p>
     */
    public void setMediumRiskMinScore(Long MediumRiskMinScore) {
        this.MediumRiskMinScore = MediumRiskMinScore;
    }

    /**
     * Get <p>Handling method for medium risk requests. Supported values for the Name of SecurityAction: <li>Deny: block;</li><li>Monitor: monitor;</li><li>Redirect: redirect;</li><li>Challenge: challenge.</li>Default value: Monitor.</p> 
     * @return MediumRiskRequestAction <p>Handling method for medium risk requests. Supported values for the Name of SecurityAction: <li>Deny: block;</li><li>Monitor: monitor;</li><li>Redirect: redirect;</li><li>Challenge: challenge.</li>Default value: Monitor.</p>
     */
    public SecurityAction getMediumRiskRequestAction() {
        return this.MediumRiskRequestAction;
    }

    /**
     * Set <p>Handling method for medium risk requests. Supported values for the Name of SecurityAction: <li>Deny: block;</li><li>Monitor: monitor;</li><li>Redirect: redirect;</li><li>Challenge: challenge.</li>Default value: Monitor.</p>
     * @param MediumRiskRequestAction <p>Handling method for medium risk requests. Supported values for the Name of SecurityAction: <li>Deny: block;</li><li>Monitor: monitor;</li><li>Redirect: redirect;</li><li>Challenge: challenge.</li>Default value: Monitor.</p>
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

