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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PresetLayoutConfig extends AbstractModel{

    /**
    * Used to assign users to preset positions; if not assigned, users will occupy the positions set in `PresetLayoutConfig` in room entry sequence.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Stream type of the user when a specified user is assigned to the image. 0: camera; 1: screen sharing. Set this parameter to 0 when the small image is occupied by a web user.
    */
    @SerializedName("StreamType")
    @Expose
    private Long StreamType;

    /**
    * Width of the output image in pixels. If this parameter is not set, 0 is used by default.
    */
    @SerializedName("ImageWidth")
    @Expose
    private Long ImageWidth;

    /**
    * Height of the output image in pixels. If this parameter is not set, 0 is used by default.
    */
    @SerializedName("ImageHeight")
    @Expose
    private Long ImageHeight;

    /**
    * X offset of the output image in pixels. The sum of `LocationX` and `ImageWidth` cannot exceed the total width of the mixed stream. If this parameter is not set, 0 is used by default.
    */
    @SerializedName("LocationX")
    @Expose
    private Long LocationX;

    /**
    * Y offset of the output image in pixels. The sum of `LocationY` and `ImageHeight` cannot exceed the total height of the mixed stream. If this parameter is not set, 0 is used by default.
    */
    @SerializedName("LocationY")
    @Expose
    private Long LocationY;

    /**
    * Z-order of the image in pixels. If this parameter is not set, 0 is used by default.
    */
    @SerializedName("ZOrder")
    @Expose
    private Long ZOrder;

    /**
    * Render mode of the output image. 0: cropping; 1: scaling; 2: scaling on a black background. If this parameter is not set, 0 is used by default.
    */
    @SerializedName("RenderMode")
    @Expose
    private Long RenderMode;

    /**
    * Media type of the mixed stream of the user occupying the current position. 0 (default): audio and video; 1: audio; 2: video. You are advised to specify a user ID when using this parameter.
    */
    @SerializedName("MixInputType")
    @Expose
    private Long MixInputType;

    /**
    * ID of the placeholder image. If the placeholding feature is enabled, and a user for whom an image position is reserved is not sending video data, the position will show the placeholder image. The ID is generated after the placeholder image is uploaded in the TRTC console. https://intl.cloud.tencent.com/document/product/647/50769?from_cn_redirect=1
    */
    @SerializedName("PlaceImageId")
    @Expose
    private Long PlaceImageId;

    /**
     * Get Used to assign users to preset positions; if not assigned, users will occupy the positions set in `PresetLayoutConfig` in room entry sequence. 
     * @return UserId Used to assign users to preset positions; if not assigned, users will occupy the positions set in `PresetLayoutConfig` in room entry sequence.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set Used to assign users to preset positions; if not assigned, users will occupy the positions set in `PresetLayoutConfig` in room entry sequence.
     * @param UserId Used to assign users to preset positions; if not assigned, users will occupy the positions set in `PresetLayoutConfig` in room entry sequence.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Stream type of the user when a specified user is assigned to the image. 0: camera; 1: screen sharing. Set this parameter to 0 when the small image is occupied by a web user. 
     * @return StreamType Stream type of the user when a specified user is assigned to the image. 0: camera; 1: screen sharing. Set this parameter to 0 when the small image is occupied by a web user.
     */
    public Long getStreamType() {
        return this.StreamType;
    }

    /**
     * Set Stream type of the user when a specified user is assigned to the image. 0: camera; 1: screen sharing. Set this parameter to 0 when the small image is occupied by a web user.
     * @param StreamType Stream type of the user when a specified user is assigned to the image. 0: camera; 1: screen sharing. Set this parameter to 0 when the small image is occupied by a web user.
     */
    public void setStreamType(Long StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get Width of the output image in pixels. If this parameter is not set, 0 is used by default. 
     * @return ImageWidth Width of the output image in pixels. If this parameter is not set, 0 is used by default.
     */
    public Long getImageWidth() {
        return this.ImageWidth;
    }

    /**
     * Set Width of the output image in pixels. If this parameter is not set, 0 is used by default.
     * @param ImageWidth Width of the output image in pixels. If this parameter is not set, 0 is used by default.
     */
    public void setImageWidth(Long ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    /**
     * Get Height of the output image in pixels. If this parameter is not set, 0 is used by default. 
     * @return ImageHeight Height of the output image in pixels. If this parameter is not set, 0 is used by default.
     */
    public Long getImageHeight() {
        return this.ImageHeight;
    }

    /**
     * Set Height of the output image in pixels. If this parameter is not set, 0 is used by default.
     * @param ImageHeight Height of the output image in pixels. If this parameter is not set, 0 is used by default.
     */
    public void setImageHeight(Long ImageHeight) {
        this.ImageHeight = ImageHeight;
    }

    /**
     * Get X offset of the output image in pixels. The sum of `LocationX` and `ImageWidth` cannot exceed the total width of the mixed stream. If this parameter is not set, 0 is used by default. 
     * @return LocationX X offset of the output image in pixels. The sum of `LocationX` and `ImageWidth` cannot exceed the total width of the mixed stream. If this parameter is not set, 0 is used by default.
     */
    public Long getLocationX() {
        return this.LocationX;
    }

    /**
     * Set X offset of the output image in pixels. The sum of `LocationX` and `ImageWidth` cannot exceed the total width of the mixed stream. If this parameter is not set, 0 is used by default.
     * @param LocationX X offset of the output image in pixels. The sum of `LocationX` and `ImageWidth` cannot exceed the total width of the mixed stream. If this parameter is not set, 0 is used by default.
     */
    public void setLocationX(Long LocationX) {
        this.LocationX = LocationX;
    }

    /**
     * Get Y offset of the output image in pixels. The sum of `LocationY` and `ImageHeight` cannot exceed the total height of the mixed stream. If this parameter is not set, 0 is used by default. 
     * @return LocationY Y offset of the output image in pixels. The sum of `LocationY` and `ImageHeight` cannot exceed the total height of the mixed stream. If this parameter is not set, 0 is used by default.
     */
    public Long getLocationY() {
        return this.LocationY;
    }

    /**
     * Set Y offset of the output image in pixels. The sum of `LocationY` and `ImageHeight` cannot exceed the total height of the mixed stream. If this parameter is not set, 0 is used by default.
     * @param LocationY Y offset of the output image in pixels. The sum of `LocationY` and `ImageHeight` cannot exceed the total height of the mixed stream. If this parameter is not set, 0 is used by default.
     */
    public void setLocationY(Long LocationY) {
        this.LocationY = LocationY;
    }

    /**
     * Get Z-order of the image in pixels. If this parameter is not set, 0 is used by default. 
     * @return ZOrder Z-order of the image in pixels. If this parameter is not set, 0 is used by default.
     */
    public Long getZOrder() {
        return this.ZOrder;
    }

    /**
     * Set Z-order of the image in pixels. If this parameter is not set, 0 is used by default.
     * @param ZOrder Z-order of the image in pixels. If this parameter is not set, 0 is used by default.
     */
    public void setZOrder(Long ZOrder) {
        this.ZOrder = ZOrder;
    }

    /**
     * Get Render mode of the output image. 0: cropping; 1: scaling; 2: scaling on a black background. If this parameter is not set, 0 is used by default. 
     * @return RenderMode Render mode of the output image. 0: cropping; 1: scaling; 2: scaling on a black background. If this parameter is not set, 0 is used by default.
     */
    public Long getRenderMode() {
        return this.RenderMode;
    }

    /**
     * Set Render mode of the output image. 0: cropping; 1: scaling; 2: scaling on a black background. If this parameter is not set, 0 is used by default.
     * @param RenderMode Render mode of the output image. 0: cropping; 1: scaling; 2: scaling on a black background. If this parameter is not set, 0 is used by default.
     */
    public void setRenderMode(Long RenderMode) {
        this.RenderMode = RenderMode;
    }

    /**
     * Get Media type of the mixed stream of the user occupying the current position. 0 (default): audio and video; 1: audio; 2: video. You are advised to specify a user ID when using this parameter. 
     * @return MixInputType Media type of the mixed stream of the user occupying the current position. 0 (default): audio and video; 1: audio; 2: video. You are advised to specify a user ID when using this parameter.
     */
    public Long getMixInputType() {
        return this.MixInputType;
    }

    /**
     * Set Media type of the mixed stream of the user occupying the current position. 0 (default): audio and video; 1: audio; 2: video. You are advised to specify a user ID when using this parameter.
     * @param MixInputType Media type of the mixed stream of the user occupying the current position. 0 (default): audio and video; 1: audio; 2: video. You are advised to specify a user ID when using this parameter.
     */
    public void setMixInputType(Long MixInputType) {
        this.MixInputType = MixInputType;
    }

    /**
     * Get ID of the placeholder image. If the placeholding feature is enabled, and a user for whom an image position is reserved is not sending video data, the position will show the placeholder image. The ID is generated after the placeholder image is uploaded in the TRTC console. https://intl.cloud.tencent.com/document/product/647/50769?from_cn_redirect=1 
     * @return PlaceImageId ID of the placeholder image. If the placeholding feature is enabled, and a user for whom an image position is reserved is not sending video data, the position will show the placeholder image. The ID is generated after the placeholder image is uploaded in the TRTC console. https://intl.cloud.tencent.com/document/product/647/50769?from_cn_redirect=1
     */
    public Long getPlaceImageId() {
        return this.PlaceImageId;
    }

    /**
     * Set ID of the placeholder image. If the placeholding feature is enabled, and a user for whom an image position is reserved is not sending video data, the position will show the placeholder image. The ID is generated after the placeholder image is uploaded in the TRTC console. https://intl.cloud.tencent.com/document/product/647/50769?from_cn_redirect=1
     * @param PlaceImageId ID of the placeholder image. If the placeholding feature is enabled, and a user for whom an image position is reserved is not sending video data, the position will show the placeholder image. The ID is generated after the placeholder image is uploaded in the TRTC console. https://intl.cloud.tencent.com/document/product/647/50769?from_cn_redirect=1
     */
    public void setPlaceImageId(Long PlaceImageId) {
        this.PlaceImageId = PlaceImageId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "StreamType", this.StreamType);
        this.setParamSimple(map, prefix + "ImageWidth", this.ImageWidth);
        this.setParamSimple(map, prefix + "ImageHeight", this.ImageHeight);
        this.setParamSimple(map, prefix + "LocationX", this.LocationX);
        this.setParamSimple(map, prefix + "LocationY", this.LocationY);
        this.setParamSimple(map, prefix + "ZOrder", this.ZOrder);
        this.setParamSimple(map, prefix + "RenderMode", this.RenderMode);
        this.setParamSimple(map, prefix + "MixInputType", this.MixInputType);
        this.setParamSimple(map, prefix + "PlaceImageId", this.PlaceImageId);

    }
}

