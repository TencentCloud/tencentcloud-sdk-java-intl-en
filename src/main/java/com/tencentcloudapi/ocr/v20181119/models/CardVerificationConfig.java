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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CardVerificationConfig extends AbstractModel {

    /**
    * <p>Whether to perform card field recognition, true by default</p>
    */
    @SerializedName("EnableRecognition")
    @Expose
    private Boolean EnableRecognition;

    /**
    * <p>Whether to perform quality detection (blurry/reflective/incomplete border/obstruction). false by default</p>
    */
    @SerializedName("EnableQualityCheck")
    @Expose
    private Boolean EnableQualityCheck;

    /**
    * <p>Whether to perform tampering detection (PS/synthesis/electronic). false by default</p>
    */
    @SerializedName("EnableTamperCheck")
    @Expose
    private Boolean EnableTamperCheck;

    /**
    * <p>Whether to perform photocopy detection. false by default</p>
    */
    @SerializedName("EnableCopyCheck")
    @Expose
    private Boolean EnableCopyCheck;

    /**
    * <p>Whether to perform rephotography detection. false by default</p>
    */
    @SerializedName("EnableRecaptureCheck")
    @Expose
    private Boolean EnableRecaptureCheck;

    /**
    * <p>Whether to perform format validation (dependent recognition). false by default</p>
    */
    @SerializedName("EnableFormatCheck")
    @Expose
    private Boolean EnableFormatCheck;

    /**
    * <p>Whether to perform both sides consistency check (dependent on recognition), false by default</p>
    */
    @SerializedName("EnableConsistencyCheck")
    @Expose
    private Boolean EnableConsistencyCheck;

    /**
     * Get <p>Whether to perform card field recognition, true by default</p> 
     * @return EnableRecognition <p>Whether to perform card field recognition, true by default</p>
     */
    public Boolean getEnableRecognition() {
        return this.EnableRecognition;
    }

    /**
     * Set <p>Whether to perform card field recognition, true by default</p>
     * @param EnableRecognition <p>Whether to perform card field recognition, true by default</p>
     */
    public void setEnableRecognition(Boolean EnableRecognition) {
        this.EnableRecognition = EnableRecognition;
    }

    /**
     * Get <p>Whether to perform quality detection (blurry/reflective/incomplete border/obstruction). false by default</p> 
     * @return EnableQualityCheck <p>Whether to perform quality detection (blurry/reflective/incomplete border/obstruction). false by default</p>
     */
    public Boolean getEnableQualityCheck() {
        return this.EnableQualityCheck;
    }

    /**
     * Set <p>Whether to perform quality detection (blurry/reflective/incomplete border/obstruction). false by default</p>
     * @param EnableQualityCheck <p>Whether to perform quality detection (blurry/reflective/incomplete border/obstruction). false by default</p>
     */
    public void setEnableQualityCheck(Boolean EnableQualityCheck) {
        this.EnableQualityCheck = EnableQualityCheck;
    }

    /**
     * Get <p>Whether to perform tampering detection (PS/synthesis/electronic). false by default</p> 
     * @return EnableTamperCheck <p>Whether to perform tampering detection (PS/synthesis/electronic). false by default</p>
     */
    public Boolean getEnableTamperCheck() {
        return this.EnableTamperCheck;
    }

    /**
     * Set <p>Whether to perform tampering detection (PS/synthesis/electronic). false by default</p>
     * @param EnableTamperCheck <p>Whether to perform tampering detection (PS/synthesis/electronic). false by default</p>
     */
    public void setEnableTamperCheck(Boolean EnableTamperCheck) {
        this.EnableTamperCheck = EnableTamperCheck;
    }

    /**
     * Get <p>Whether to perform photocopy detection. false by default</p> 
     * @return EnableCopyCheck <p>Whether to perform photocopy detection. false by default</p>
     */
    public Boolean getEnableCopyCheck() {
        return this.EnableCopyCheck;
    }

    /**
     * Set <p>Whether to perform photocopy detection. false by default</p>
     * @param EnableCopyCheck <p>Whether to perform photocopy detection. false by default</p>
     */
    public void setEnableCopyCheck(Boolean EnableCopyCheck) {
        this.EnableCopyCheck = EnableCopyCheck;
    }

    /**
     * Get <p>Whether to perform rephotography detection. false by default</p> 
     * @return EnableRecaptureCheck <p>Whether to perform rephotography detection. false by default</p>
     */
    public Boolean getEnableRecaptureCheck() {
        return this.EnableRecaptureCheck;
    }

    /**
     * Set <p>Whether to perform rephotography detection. false by default</p>
     * @param EnableRecaptureCheck <p>Whether to perform rephotography detection. false by default</p>
     */
    public void setEnableRecaptureCheck(Boolean EnableRecaptureCheck) {
        this.EnableRecaptureCheck = EnableRecaptureCheck;
    }

    /**
     * Get <p>Whether to perform format validation (dependent recognition). false by default</p> 
     * @return EnableFormatCheck <p>Whether to perform format validation (dependent recognition). false by default</p>
     */
    public Boolean getEnableFormatCheck() {
        return this.EnableFormatCheck;
    }

    /**
     * Set <p>Whether to perform format validation (dependent recognition). false by default</p>
     * @param EnableFormatCheck <p>Whether to perform format validation (dependent recognition). false by default</p>
     */
    public void setEnableFormatCheck(Boolean EnableFormatCheck) {
        this.EnableFormatCheck = EnableFormatCheck;
    }

    /**
     * Get <p>Whether to perform both sides consistency check (dependent on recognition), false by default</p> 
     * @return EnableConsistencyCheck <p>Whether to perform both sides consistency check (dependent on recognition), false by default</p>
     */
    public Boolean getEnableConsistencyCheck() {
        return this.EnableConsistencyCheck;
    }

    /**
     * Set <p>Whether to perform both sides consistency check (dependent on recognition), false by default</p>
     * @param EnableConsistencyCheck <p>Whether to perform both sides consistency check (dependent on recognition), false by default</p>
     */
    public void setEnableConsistencyCheck(Boolean EnableConsistencyCheck) {
        this.EnableConsistencyCheck = EnableConsistencyCheck;
    }

    public CardVerificationConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CardVerificationConfig(CardVerificationConfig source) {
        if (source.EnableRecognition != null) {
            this.EnableRecognition = new Boolean(source.EnableRecognition);
        }
        if (source.EnableQualityCheck != null) {
            this.EnableQualityCheck = new Boolean(source.EnableQualityCheck);
        }
        if (source.EnableTamperCheck != null) {
            this.EnableTamperCheck = new Boolean(source.EnableTamperCheck);
        }
        if (source.EnableCopyCheck != null) {
            this.EnableCopyCheck = new Boolean(source.EnableCopyCheck);
        }
        if (source.EnableRecaptureCheck != null) {
            this.EnableRecaptureCheck = new Boolean(source.EnableRecaptureCheck);
        }
        if (source.EnableFormatCheck != null) {
            this.EnableFormatCheck = new Boolean(source.EnableFormatCheck);
        }
        if (source.EnableConsistencyCheck != null) {
            this.EnableConsistencyCheck = new Boolean(source.EnableConsistencyCheck);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableRecognition", this.EnableRecognition);
        this.setParamSimple(map, prefix + "EnableQualityCheck", this.EnableQualityCheck);
        this.setParamSimple(map, prefix + "EnableTamperCheck", this.EnableTamperCheck);
        this.setParamSimple(map, prefix + "EnableCopyCheck", this.EnableCopyCheck);
        this.setParamSimple(map, prefix + "EnableRecaptureCheck", this.EnableRecaptureCheck);
        this.setParamSimple(map, prefix + "EnableFormatCheck", this.EnableFormatCheck);
        this.setParamSimple(map, prefix + "EnableConsistencyCheck", this.EnableConsistencyCheck);

    }
}

