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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LabelDetailItem extends AbstractModel{

    /**
    * This field is used to return the ID of the recognized object for easier recognition and distinction.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * This field is used to return the hit subtag name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * This field is used to return the hit score of the subtag. Value range: **0–100**; for example, *Porn-SexBehavior 99* indicates that the hit score of the *Porn-SexBehavior* tag for the recognized content is 99.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
     * Get This field is used to return the ID of the recognized object for easier recognition and distinction.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Id This field is used to return the ID of the recognized object for easier recognition and distinction.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set This field is used to return the ID of the recognized object for easier recognition and distinction.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Id This field is used to return the ID of the recognized object for easier recognition and distinction.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get This field is used to return the hit subtag name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Name This field is used to return the hit subtag name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set This field is used to return the hit subtag name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Name This field is used to return the hit subtag name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get This field is used to return the hit score of the subtag. Value range: **0–100**; for example, *Porn-SexBehavior 99* indicates that the hit score of the *Porn-SexBehavior* tag for the recognized content is 99.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Score This field is used to return the hit score of the subtag. Value range: **0–100**; for example, *Porn-SexBehavior 99* indicates that the hit score of the *Porn-SexBehavior* tag for the recognized content is 99.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set This field is used to return the hit score of the subtag. Value range: **0–100**; for example, *Porn-SexBehavior 99* indicates that the hit score of the *Porn-SexBehavior* tag for the recognized content is 99.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Score This field is used to return the hit score of the subtag. Value range: **0–100**; for example, *Porn-SexBehavior 99* indicates that the hit score of the *Porn-SexBehavior* tag for the recognized content is 99.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    public LabelDetailItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LabelDetailItem(LabelDetailItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

