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
package com.tencentcloudapi.ims.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LibDetail extends AbstractModel {

    /**
    * This field is used to return the ID of the recognized object for easier recognition and distinction.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the ID of the custom library for easier custom library management and configuration.
    */
    @SerializedName("LibId")
    @Expose
    private String LibId;

    /**
    * This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the name of the custom library for easier custom library management and configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LibName")
    @Expose
    private String LibName;

    /**
    * This field is used to return the ID of the recognized image object for easier file management.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * This field is used to return other custom tags to meet the needs in your customized scenarios. It can be skipped if you have no custom needs.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * This field is used to return the hit score of the model. Value range: **0–100**; for example, *Porn 99* indicates that the hit score of the porn tag for the recognized content is 99.
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
     * Get This field is used to return the ID of the recognized object for easier recognition and distinction. 
     * @return Id This field is used to return the ID of the recognized object for easier recognition and distinction.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set This field is used to return the ID of the recognized object for easier recognition and distinction.
     * @param Id This field is used to return the ID of the recognized object for easier recognition and distinction.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the ID of the custom library for easier custom library management and configuration. 
     * @return LibId This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the ID of the custom library for easier custom library management and configuration.
     */
    public String getLibId() {
        return this.LibId;
    }

    /**
     * Set This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the ID of the custom library for easier custom library management and configuration.
     * @param LibId This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the ID of the custom library for easier custom library management and configuration.
     */
    public void setLibId(String LibId) {
        this.LibId = LibId;
    }

    /**
     * Get This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the name of the custom library for easier custom library management and configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LibName This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the name of the custom library for easier custom library management and configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLibName() {
        return this.LibName;
    }

    /**
     * Set This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the name of the custom library for easier custom library management and configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LibName This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the name of the custom library for easier custom library management and configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLibName(String LibName) {
        this.LibName = LibName;
    }

    /**
     * Get This field is used to return the ID of the recognized image object for easier file management. 
     * @return ImageId This field is used to return the ID of the recognized image object for easier file management.
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set This field is used to return the ID of the recognized image object for easier file management.
     * @param ImageId This field is used to return the ID of the recognized image object for easier file management.
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content. 
     * @return Label This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
     * @param Label This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get This field is used to return other custom tags to meet the needs in your customized scenarios. It can be skipped if you have no custom needs.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Tag This field is used to return other custom tags to meet the needs in your customized scenarios. It can be skipped if you have no custom needs.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set This field is used to return other custom tags to meet the needs in your customized scenarios. It can be skipped if you have no custom needs.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Tag This field is used to return other custom tags to meet the needs in your customized scenarios. It can be skipped if you have no custom needs.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get This field is used to return the hit score of the model. Value range: **0–100**; for example, *Porn 99* indicates that the hit score of the porn tag for the recognized content is 99. 
     * @return Score This field is used to return the hit score of the model. Value range: **0–100**; for example, *Porn 99* indicates that the hit score of the porn tag for the recognized content is 99.
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set This field is used to return the hit score of the model. Value range: **0–100**; for example, *Porn 99* indicates that the hit score of the porn tag for the recognized content is 99.
     * @param Score This field is used to return the hit score of the model. Value range: **0–100**; for example, *Porn 99* indicates that the hit score of the porn tag for the recognized content is 99.
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    public LibDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LibDetail(LibDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.LibId != null) {
            this.LibId = new String(source.LibId);
        }
        if (source.LibName != null) {
            this.LibName = new String(source.LibName);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "LibId", this.LibId);
        this.setParamSimple(map, prefix + "LibName", this.LibName);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

