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

public class RecognitionTag extends AbstractModel{

    /**
    * Tag name
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Confidence score. Value: 1 to 100. 
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * Location information. It returns 0 if there is not location information.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Location")
    @Expose
    private Location Location;

    /**
     * Get Tag name
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Name Tag name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Tag name
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Name Tag name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Confidence score. Value: 1 to 100. 
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Score Confidence score. Value: 1 to 100. 
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set Confidence score. Value: 1 to 100. 
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Score Confidence score. Value: 1 to 100. 
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get Location information. It returns 0 if there is not location information.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Location Location information. It returns 0 if there is not location information.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Location getLocation() {
        return this.Location;
    }

    /**
     * Set Location information. It returns 0 if there is not location information.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Location Location information. It returns 0 if there is not location information.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLocation(Location Location) {
        this.Location = Location;
    }

    public RecognitionTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognitionTag(RecognitionTag source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Location != null) {
            this.Location = new Location(source.Location);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamObj(map, prefix + "Location.", this.Location);

    }
}

