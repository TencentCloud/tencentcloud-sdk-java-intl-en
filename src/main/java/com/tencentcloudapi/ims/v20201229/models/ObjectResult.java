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
package com.tencentcloudapi.ims.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ObjectResult extends AbstractModel {

    /**
    * This field is used to return the recognized object scenario result, such as QR code, logo, and image OCR.
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * This field is used to return the operation suggestion for the current maliciousness tag. When you get the determination result, the returned value indicates the operation suggested by the system. We recommend you handle different types of violations and suggestions according to your business needs. <br>Returned values: **Block**, **Review**, **Pass**.
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * This field is used to return the maliciousness tag in the detection result, which represents the moderation result suggested by the model. We recommend you handle different types of violations and suggestions according to your business needs. <br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * This field is used to return the detection result for a subtag under the current maliciousness tag, such as *Porn-SexBehavior*.
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * This field is used to return the hit score of a subtag under the current maliciousness tag. Value range: **0–100**; for example, *Porn-SexBehavior 99* indicates that the hit score of the *Porn-SexBehavior* tag for the recognized content is 99.
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * This field is used to return the name of the recognized object.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * This field is used to return the details of the recognized object, such as number, hit tag name, and position coordinates. For more information on the returned value, see the description of the [ObjectDetail](https://intl.cloud.tencent.com/document/api/1125/53274?from_cn_redirect=1#ObjectDetail) data structure.
 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Details")
    @Expose
    private ObjectDetail [] Details;

    /**
     * Get This field is used to return the recognized object scenario result, such as QR code, logo, and image OCR. 
     * @return Scene This field is used to return the recognized object scenario result, such as QR code, logo, and image OCR.
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set This field is used to return the recognized object scenario result, such as QR code, logo, and image OCR.
     * @param Scene This field is used to return the recognized object scenario result, such as QR code, logo, and image OCR.
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get This field is used to return the operation suggestion for the current maliciousness tag. When you get the determination result, the returned value indicates the operation suggested by the system. We recommend you handle different types of violations and suggestions according to your business needs. <br>Returned values: **Block**, **Review**, **Pass**. 
     * @return Suggestion This field is used to return the operation suggestion for the current maliciousness tag. When you get the determination result, the returned value indicates the operation suggested by the system. We recommend you handle different types of violations and suggestions according to your business needs. <br>Returned values: **Block**, **Review**, **Pass**.
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set This field is used to return the operation suggestion for the current maliciousness tag. When you get the determination result, the returned value indicates the operation suggested by the system. We recommend you handle different types of violations and suggestions according to your business needs. <br>Returned values: **Block**, **Review**, **Pass**.
     * @param Suggestion This field is used to return the operation suggestion for the current maliciousness tag. When you get the determination result, the returned value indicates the operation suggested by the system. We recommend you handle different types of violations and suggestions according to your business needs. <br>Returned values: **Block**, **Review**, **Pass**.
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get This field is used to return the maliciousness tag in the detection result, which represents the moderation result suggested by the model. We recommend you handle different types of violations and suggestions according to your business needs. <br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content. 
     * @return Label This field is used to return the maliciousness tag in the detection result, which represents the moderation result suggested by the model. We recommend you handle different types of violations and suggestions according to your business needs. <br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set This field is used to return the maliciousness tag in the detection result, which represents the moderation result suggested by the model. We recommend you handle different types of violations and suggestions according to your business needs. <br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
     * @param Label This field is used to return the maliciousness tag in the detection result, which represents the moderation result suggested by the model. We recommend you handle different types of violations and suggestions according to your business needs. <br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get This field is used to return the detection result for a subtag under the current maliciousness tag, such as *Porn-SexBehavior*. 
     * @return SubLabel This field is used to return the detection result for a subtag under the current maliciousness tag, such as *Porn-SexBehavior*.
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set This field is used to return the detection result for a subtag under the current maliciousness tag, such as *Porn-SexBehavior*.
     * @param SubLabel This field is used to return the detection result for a subtag under the current maliciousness tag, such as *Porn-SexBehavior*.
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get This field is used to return the hit score of a subtag under the current maliciousness tag. Value range: **0–100**; for example, *Porn-SexBehavior 99* indicates that the hit score of the *Porn-SexBehavior* tag for the recognized content is 99. 
     * @return Score This field is used to return the hit score of a subtag under the current maliciousness tag. Value range: **0–100**; for example, *Porn-SexBehavior 99* indicates that the hit score of the *Porn-SexBehavior* tag for the recognized content is 99.
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set This field is used to return the hit score of a subtag under the current maliciousness tag. Value range: **0–100**; for example, *Porn-SexBehavior 99* indicates that the hit score of the *Porn-SexBehavior* tag for the recognized content is 99.
     * @param Score This field is used to return the hit score of a subtag under the current maliciousness tag. Value range: **0–100**; for example, *Porn-SexBehavior 99* indicates that the hit score of the *Porn-SexBehavior* tag for the recognized content is 99.
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get This field is used to return the name of the recognized object.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Names This field is used to return the name of the recognized object.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set This field is used to return the name of the recognized object.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Names This field is used to return the name of the recognized object.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get This field is used to return the details of the recognized object, such as number, hit tag name, and position coordinates. For more information on the returned value, see the description of the [ObjectDetail](https://intl.cloud.tencent.com/document/api/1125/53274?from_cn_redirect=1#ObjectDetail) data structure.
 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Details This field is used to return the details of the recognized object, such as number, hit tag name, and position coordinates. For more information on the returned value, see the description of the [ObjectDetail](https://intl.cloud.tencent.com/document/api/1125/53274?from_cn_redirect=1#ObjectDetail) data structure.
 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ObjectDetail [] getDetails() {
        return this.Details;
    }

    /**
     * Set This field is used to return the details of the recognized object, such as number, hit tag name, and position coordinates. For more information on the returned value, see the description of the [ObjectDetail](https://intl.cloud.tencent.com/document/api/1125/53274?from_cn_redirect=1#ObjectDetail) data structure.
 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Details This field is used to return the details of the recognized object, such as number, hit tag name, and position coordinates. For more information on the returned value, see the description of the [ObjectDetail](https://intl.cloud.tencent.com/document/api/1125/53274?from_cn_redirect=1#ObjectDetail) data structure.
 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDetails(ObjectDetail [] Details) {
        this.Details = Details;
    }

    public ObjectResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ObjectResult(ObjectResult source) {
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Names != null) {
            this.Names = new String[source.Names.length];
            for (int i = 0; i < source.Names.length; i++) {
                this.Names[i] = new String(source.Names[i]);
            }
        }
        if (source.Details != null) {
            this.Details = new ObjectDetail[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new ObjectDetail(source.Details[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);

    }
}

