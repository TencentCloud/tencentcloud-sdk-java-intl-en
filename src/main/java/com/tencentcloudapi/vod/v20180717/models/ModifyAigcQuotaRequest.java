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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAigcQuotaRequest extends AbstractModel {

    /**
    * <p><strong>VOD application ID. For customers who activate on-demand services after December 25, 2023, this field must be filled in with the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</strong></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Quota type</p><p>Enumeration values:</p><ul><li>Image: AIGC image task</li><li>Video: AIGC video task</li><li>Text: AIGC text task</li></ul>
    */
    @SerializedName("QuotaType")
    @Expose
    private String QuotaType;

    /**
    * <p>Number of quotas for the task.</p><p>Unit: images/second/tokens.</p><ul><li>When QuotaType is Image, the unit is images;</li><li>When QuotaType is Video, the unit is seconds;</li><li>When QuotaType is Text, the unit is tokens.</li></ul>
    */
    @SerializedName("QuotaLimit")
    @Expose
    private Long QuotaLimit;

    /**
    * <p>Valid only when QuotaType=Text, used to select the ApiToken that requires quota limit</p>
    */
    @SerializedName("ApiToken")
    @Expose
    private String ApiToken;

    /**
    * <p>Quota reset cycle.</p><p>Enumeration values:</p><ul><li>Day: Reset daily.</li><li>Month: Reset on a specified date per month.</li><li>Total: Never reset. The QuotaLimit parameter is the total quota.</li></ul>
    */
    @SerializedName("QuotaPeriod")
    @Expose
    private String QuotaPeriod;

    /**
    * <p>Reset date of the monthly quota. Valid only when QuotaPeriod=Month.</p><p>If the selected date does not exist in the current month, the reset will be postponed to 00:00 on the 1st of the next month.</p>
    */
    @SerializedName("ResetDay")
    @Expose
    private Long ResetDay;

    /**
    * <p>Whether to set specified quotas for each model</p><p>Enumeration values: </p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul>
    */
    @SerializedName("ModelQuotaSwitch")
    @Expose
    private String ModelQuotaSwitch;

    /**
    * <p>Quota set for each model, valid only when ModelQuotaSwitch=ON.</p>
    */
    @SerializedName("ModelQuotas")
    @Expose
    private AigcModelQuota [] ModelQuotas;

    /**
     * Get <p><strong>VOD application ID. For customers who activate on-demand services after December 25, 2023, this field must be filled in with the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</strong></p> 
     * @return SubAppId <p><strong>VOD application ID. For customers who activate on-demand services after December 25, 2023, this field must be filled in with the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</strong></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><strong>VOD application ID. For customers who activate on-demand services after December 25, 2023, this field must be filled in with the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</strong></p>
     * @param SubAppId <p><strong>VOD application ID. For customers who activate on-demand services after December 25, 2023, this field must be filled in with the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</strong></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Quota type</p><p>Enumeration values:</p><ul><li>Image: AIGC image task</li><li>Video: AIGC video task</li><li>Text: AIGC text task</li></ul> 
     * @return QuotaType <p>Quota type</p><p>Enumeration values:</p><ul><li>Image: AIGC image task</li><li>Video: AIGC video task</li><li>Text: AIGC text task</li></ul>
     */
    public String getQuotaType() {
        return this.QuotaType;
    }

    /**
     * Set <p>Quota type</p><p>Enumeration values:</p><ul><li>Image: AIGC image task</li><li>Video: AIGC video task</li><li>Text: AIGC text task</li></ul>
     * @param QuotaType <p>Quota type</p><p>Enumeration values:</p><ul><li>Image: AIGC image task</li><li>Video: AIGC video task</li><li>Text: AIGC text task</li></ul>
     */
    public void setQuotaType(String QuotaType) {
        this.QuotaType = QuotaType;
    }

    /**
     * Get <p>Number of quotas for the task.</p><p>Unit: images/second/tokens.</p><ul><li>When QuotaType is Image, the unit is images;</li><li>When QuotaType is Video, the unit is seconds;</li><li>When QuotaType is Text, the unit is tokens.</li></ul> 
     * @return QuotaLimit <p>Number of quotas for the task.</p><p>Unit: images/second/tokens.</p><ul><li>When QuotaType is Image, the unit is images;</li><li>When QuotaType is Video, the unit is seconds;</li><li>When QuotaType is Text, the unit is tokens.</li></ul>
     */
    public Long getQuotaLimit() {
        return this.QuotaLimit;
    }

    /**
     * Set <p>Number of quotas for the task.</p><p>Unit: images/second/tokens.</p><ul><li>When QuotaType is Image, the unit is images;</li><li>When QuotaType is Video, the unit is seconds;</li><li>When QuotaType is Text, the unit is tokens.</li></ul>
     * @param QuotaLimit <p>Number of quotas for the task.</p><p>Unit: images/second/tokens.</p><ul><li>When QuotaType is Image, the unit is images;</li><li>When QuotaType is Video, the unit is seconds;</li><li>When QuotaType is Text, the unit is tokens.</li></ul>
     */
    public void setQuotaLimit(Long QuotaLimit) {
        this.QuotaLimit = QuotaLimit;
    }

    /**
     * Get <p>Valid only when QuotaType=Text, used to select the ApiToken that requires quota limit</p> 
     * @return ApiToken <p>Valid only when QuotaType=Text, used to select the ApiToken that requires quota limit</p>
     */
    public String getApiToken() {
        return this.ApiToken;
    }

    /**
     * Set <p>Valid only when QuotaType=Text, used to select the ApiToken that requires quota limit</p>
     * @param ApiToken <p>Valid only when QuotaType=Text, used to select the ApiToken that requires quota limit</p>
     */
    public void setApiToken(String ApiToken) {
        this.ApiToken = ApiToken;
    }

    /**
     * Get <p>Quota reset cycle.</p><p>Enumeration values:</p><ul><li>Day: Reset daily.</li><li>Month: Reset on a specified date per month.</li><li>Total: Never reset. The QuotaLimit parameter is the total quota.</li></ul> 
     * @return QuotaPeriod <p>Quota reset cycle.</p><p>Enumeration values:</p><ul><li>Day: Reset daily.</li><li>Month: Reset on a specified date per month.</li><li>Total: Never reset. The QuotaLimit parameter is the total quota.</li></ul>
     */
    public String getQuotaPeriod() {
        return this.QuotaPeriod;
    }

    /**
     * Set <p>Quota reset cycle.</p><p>Enumeration values:</p><ul><li>Day: Reset daily.</li><li>Month: Reset on a specified date per month.</li><li>Total: Never reset. The QuotaLimit parameter is the total quota.</li></ul>
     * @param QuotaPeriod <p>Quota reset cycle.</p><p>Enumeration values:</p><ul><li>Day: Reset daily.</li><li>Month: Reset on a specified date per month.</li><li>Total: Never reset. The QuotaLimit parameter is the total quota.</li></ul>
     */
    public void setQuotaPeriod(String QuotaPeriod) {
        this.QuotaPeriod = QuotaPeriod;
    }

    /**
     * Get <p>Reset date of the monthly quota. Valid only when QuotaPeriod=Month.</p><p>If the selected date does not exist in the current month, the reset will be postponed to 00:00 on the 1st of the next month.</p> 
     * @return ResetDay <p>Reset date of the monthly quota. Valid only when QuotaPeriod=Month.</p><p>If the selected date does not exist in the current month, the reset will be postponed to 00:00 on the 1st of the next month.</p>
     */
    public Long getResetDay() {
        return this.ResetDay;
    }

    /**
     * Set <p>Reset date of the monthly quota. Valid only when QuotaPeriod=Month.</p><p>If the selected date does not exist in the current month, the reset will be postponed to 00:00 on the 1st of the next month.</p>
     * @param ResetDay <p>Reset date of the monthly quota. Valid only when QuotaPeriod=Month.</p><p>If the selected date does not exist in the current month, the reset will be postponed to 00:00 on the 1st of the next month.</p>
     */
    public void setResetDay(Long ResetDay) {
        this.ResetDay = ResetDay;
    }

    /**
     * Get <p>Whether to set specified quotas for each model</p><p>Enumeration values: </p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul> 
     * @return ModelQuotaSwitch <p>Whether to set specified quotas for each model</p><p>Enumeration values: </p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul>
     */
    public String getModelQuotaSwitch() {
        return this.ModelQuotaSwitch;
    }

    /**
     * Set <p>Whether to set specified quotas for each model</p><p>Enumeration values: </p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul>
     * @param ModelQuotaSwitch <p>Whether to set specified quotas for each model</p><p>Enumeration values: </p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul>
     */
    public void setModelQuotaSwitch(String ModelQuotaSwitch) {
        this.ModelQuotaSwitch = ModelQuotaSwitch;
    }

    /**
     * Get <p>Quota set for each model, valid only when ModelQuotaSwitch=ON.</p> 
     * @return ModelQuotas <p>Quota set for each model, valid only when ModelQuotaSwitch=ON.</p>
     */
    public AigcModelQuota [] getModelQuotas() {
        return this.ModelQuotas;
    }

    /**
     * Set <p>Quota set for each model, valid only when ModelQuotaSwitch=ON.</p>
     * @param ModelQuotas <p>Quota set for each model, valid only when ModelQuotaSwitch=ON.</p>
     */
    public void setModelQuotas(AigcModelQuota [] ModelQuotas) {
        this.ModelQuotas = ModelQuotas;
    }

    public ModifyAigcQuotaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAigcQuotaRequest(ModifyAigcQuotaRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.QuotaType != null) {
            this.QuotaType = new String(source.QuotaType);
        }
        if (source.QuotaLimit != null) {
            this.QuotaLimit = new Long(source.QuotaLimit);
        }
        if (source.ApiToken != null) {
            this.ApiToken = new String(source.ApiToken);
        }
        if (source.QuotaPeriod != null) {
            this.QuotaPeriod = new String(source.QuotaPeriod);
        }
        if (source.ResetDay != null) {
            this.ResetDay = new Long(source.ResetDay);
        }
        if (source.ModelQuotaSwitch != null) {
            this.ModelQuotaSwitch = new String(source.ModelQuotaSwitch);
        }
        if (source.ModelQuotas != null) {
            this.ModelQuotas = new AigcModelQuota[source.ModelQuotas.length];
            for (int i = 0; i < source.ModelQuotas.length; i++) {
                this.ModelQuotas[i] = new AigcModelQuota(source.ModelQuotas[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "QuotaType", this.QuotaType);
        this.setParamSimple(map, prefix + "QuotaLimit", this.QuotaLimit);
        this.setParamSimple(map, prefix + "ApiToken", this.ApiToken);
        this.setParamSimple(map, prefix + "QuotaPeriod", this.QuotaPeriod);
        this.setParamSimple(map, prefix + "ResetDay", this.ResetDay);
        this.setParamSimple(map, prefix + "ModelQuotaSwitch", this.ModelQuotaSwitch);
        this.setParamArrayObj(map, prefix + "ModelQuotas.", this.ModelQuotas);

    }
}

