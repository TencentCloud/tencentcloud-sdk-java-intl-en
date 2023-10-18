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
package com.tencentcloudapi.vm.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageSegments extends AbstractModel {

    /**
    * This field is used to return the frame capturing time of a video segment in seconds. For video on demand files, this parameter indicates the time offset of the captured image from the video, such as 0 (no offset), 5 (5 seconds after the start of the video), and 10 (10 seconds after the start of the video). For live video stream files, this parameter returns the Unix timestamp of the image, such as `1594650717`.
    */
    @SerializedName("OffsetTime")
    @Expose
    private String OffsetTime;

    /**
    * This field is used to return the specific moderation result of a frame captured from a video segment. For details, see the description of the `ImageResult` data structure.
    */
    @SerializedName("Result")
    @Expose
    private ImageResult Result;

    /**
     * Get This field is used to return the frame capturing time of a video segment in seconds. For video on demand files, this parameter indicates the time offset of the captured image from the video, such as 0 (no offset), 5 (5 seconds after the start of the video), and 10 (10 seconds after the start of the video). For live video stream files, this parameter returns the Unix timestamp of the image, such as `1594650717`. 
     * @return OffsetTime This field is used to return the frame capturing time of a video segment in seconds. For video on demand files, this parameter indicates the time offset of the captured image from the video, such as 0 (no offset), 5 (5 seconds after the start of the video), and 10 (10 seconds after the start of the video). For live video stream files, this parameter returns the Unix timestamp of the image, such as `1594650717`.
     */
    public String getOffsetTime() {
        return this.OffsetTime;
    }

    /**
     * Set This field is used to return the frame capturing time of a video segment in seconds. For video on demand files, this parameter indicates the time offset of the captured image from the video, such as 0 (no offset), 5 (5 seconds after the start of the video), and 10 (10 seconds after the start of the video). For live video stream files, this parameter returns the Unix timestamp of the image, such as `1594650717`.
     * @param OffsetTime This field is used to return the frame capturing time of a video segment in seconds. For video on demand files, this parameter indicates the time offset of the captured image from the video, such as 0 (no offset), 5 (5 seconds after the start of the video), and 10 (10 seconds after the start of the video). For live video stream files, this parameter returns the Unix timestamp of the image, such as `1594650717`.
     */
    public void setOffsetTime(String OffsetTime) {
        this.OffsetTime = OffsetTime;
    }

    /**
     * Get This field is used to return the specific moderation result of a frame captured from a video segment. For details, see the description of the `ImageResult` data structure. 
     * @return Result This field is used to return the specific moderation result of a frame captured from a video segment. For details, see the description of the `ImageResult` data structure.
     */
    public ImageResult getResult() {
        return this.Result;
    }

    /**
     * Set This field is used to return the specific moderation result of a frame captured from a video segment. For details, see the description of the `ImageResult` data structure.
     * @param Result This field is used to return the specific moderation result of a frame captured from a video segment. For details, see the description of the `ImageResult` data structure.
     */
    public void setResult(ImageResult Result) {
        this.Result = Result;
    }

    public ImageSegments() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageSegments(ImageSegments source) {
        if (source.OffsetTime != null) {
            this.OffsetTime = new String(source.OffsetTime);
        }
        if (source.Result != null) {
            this.Result = new ImageResult(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OffsetTime", this.OffsetTime);
        this.setParamObj(map, prefix + "Result.", this.Result);

    }
}

