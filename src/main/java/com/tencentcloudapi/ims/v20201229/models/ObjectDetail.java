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

public class ObjectDetail extends AbstractModel{

    /**
    * This parameter is used to return the ID of the recognized object for easier recognition and distinction.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * This parameter is used to return the hit object tag.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * This parameter is used to return the value or content of the object tag; for example, when the tag is *QR code (QrCode)*, this field will be the URL of the recognized QR code.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * This parameter is used to return the hit score of the object tag. Valid values: **0–100**; for example, *QrCode 99* indicates that it is highly likely that the recognized content will hit the QR code tag.
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * This field is used to return the coordinate position (X and Y coordinates of the top-left corner, length, width, and rotation angle) of the object detection frame for quick location of the object information.
    */
    @SerializedName("Location")
    @Expose
    private Location Location;

    /**
    * This parameter is used to return the hit object subtag.
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
     * Get This parameter is used to return the ID of the recognized object for easier recognition and distinction. 
     * @return Id This parameter is used to return the ID of the recognized object for easier recognition and distinction.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set This parameter is used to return the ID of the recognized object for easier recognition and distinction.
     * @param Id This parameter is used to return the ID of the recognized object for easier recognition and distinction.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get This parameter is used to return the hit object tag. 
     * @return Name This parameter is used to return the hit object tag.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set This parameter is used to return the hit object tag.
     * @param Name This parameter is used to return the hit object tag.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get This parameter is used to return the value or content of the object tag; for example, when the tag is *QR code (QrCode)*, this field will be the URL of the recognized QR code. 
     * @return Value This parameter is used to return the value or content of the object tag; for example, when the tag is *QR code (QrCode)*, this field will be the URL of the recognized QR code.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set This parameter is used to return the value or content of the object tag; for example, when the tag is *QR code (QrCode)*, this field will be the URL of the recognized QR code.
     * @param Value This parameter is used to return the value or content of the object tag; for example, when the tag is *QR code (QrCode)*, this field will be the URL of the recognized QR code.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get This parameter is used to return the hit score of the object tag. Valid values: **0–100**; for example, *QrCode 99* indicates that it is highly likely that the recognized content will hit the QR code tag. 
     * @return Score This parameter is used to return the hit score of the object tag. Valid values: **0–100**; for example, *QrCode 99* indicates that it is highly likely that the recognized content will hit the QR code tag.
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set This parameter is used to return the hit score of the object tag. Valid values: **0–100**; for example, *QrCode 99* indicates that it is highly likely that the recognized content will hit the QR code tag.
     * @param Score This parameter is used to return the hit score of the object tag. Valid values: **0–100**; for example, *QrCode 99* indicates that it is highly likely that the recognized content will hit the QR code tag.
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get This field is used to return the coordinate position (X and Y coordinates of the top-left corner, length, width, and rotation angle) of the object detection frame for quick location of the object information. 
     * @return Location This field is used to return the coordinate position (X and Y coordinates of the top-left corner, length, width, and rotation angle) of the object detection frame for quick location of the object information.
     */
    public Location getLocation() {
        return this.Location;
    }

    /**
     * Set This field is used to return the coordinate position (X and Y coordinates of the top-left corner, length, width, and rotation angle) of the object detection frame for quick location of the object information.
     * @param Location This field is used to return the coordinate position (X and Y coordinates of the top-left corner, length, width, and rotation angle) of the object detection frame for quick location of the object information.
     */
    public void setLocation(Location Location) {
        this.Location = Location;
    }

    /**
     * Get This parameter is used to return the hit object subtag. 
     * @return SubLabel This parameter is used to return the hit object subtag.
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set This parameter is used to return the hit object subtag.
     * @param SubLabel This parameter is used to return the hit object subtag.
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    public ObjectDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ObjectDetail(ObjectDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Location != null) {
            this.Location = new Location(source.Location);
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamObj(map, prefix + "Location.", this.Location);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);

    }
}

