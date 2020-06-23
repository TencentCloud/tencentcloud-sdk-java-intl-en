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
package com.tencentcloudapi.iai.v20200303;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.iai.v20200303.models.*;

public class IaiClient extends AbstractClient{
    private static String endpoint = "iai.tencentcloudapi.com";
    private static String version = "2020-03-03";

    public IaiClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IaiClient(Credential credential, String region, ClientProfile profile) {
        super(IaiClient.endpoint, IaiClient.version, credential, region, profile);
    }

    /**
     *This API is used to perform facial feature localization (aka facial keypoint localization) on a given image and calculate 90 facial keypoints that make up the contour of the face, including eyebrows (8 points on the left and 8 on the right), eyes (8 points on the left and 8 on the right), nose (13 points), mouth (22 points), face contour (21 points), and eyeballs or pupils (2 points).

>     
- Please use the signature algorithm v3 to calculate the signature in the common parameters, that is, set the `SignatureMethod` parameter to `TC3-HMAC-SHA256`.
     * @param req AnalyzeFaceRequest
     * @return AnalyzeFaceResponse
     * @throws TencentCloudSDKException
     */
    public AnalyzeFaceResponse AnalyzeFace(AnalyzeFaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AnalyzeFaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AnalyzeFaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AnalyzeFace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to check a specified group for suspected duplicate persons and list their information.

You can use this API to check for duplicate persons in one group so as to avoid situations where the same person has multiple roles in the group. You can also use it to check for duplicate persons across multiple groups to see whether the same person exists in multiple groups at the same time.

Duplicate check across algorithm model versions is not supported. Currently, this feature is available only to groups with algorithm model v3.0.

>     
- If you perform a duplicate check on the same group again, you need to wait for the last operation to complete, that is, when the `GroupIds` entered in the two requests are the same, if the first request is not completed, the second request will fail.

>     
- The status of the group on which the duplicate check is to be performed is that when the duplicate check task really starts, that is, after you initiate the duplicate check request; if your duplicate check task needs to queue up, any addition or deletion operation performed on the group during the queuing will affect the duplicate check result. Tencent Cloud will use the group status when the duplicate check task actually starts. After the task starts, any operation on the group will not affect the task execution; however, you are still recommended not to add/delete persons or faces to/from the group after the task starts.
     * @param req CheckSimilarPersonRequest
     * @return CheckSimilarPersonResponse
     * @throws TencentCloudSDKException
     */
    public CheckSimilarPersonResponse CheckSimilarPerson(CheckSimilarPersonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckSimilarPersonResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CheckSimilarPersonResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CheckSimilarPerson"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to calculate the similarity of faces in two images and return the face similarity score.

If you need to judge "whether the person in the image is someone specified" in scenarios such as face login, i.e., checking whether the person in a given image is someone with a known identity, you are recommended to use the [VerifyFace](https://cloud.tencent.com/document/product/867/32806) or [VerifyPerson](https://cloud.tencent.com/document/product/867/38879) API.

>     
- Please use the signature algorithm v3 to calculate the signature in the common parameters, that is, set the `SignatureMethod` parameter to `TC3-HMAC-SHA256`.
     * @param req CompareFaceRequest
     * @return CompareFaceResponse
     * @throws TencentCloudSDKException
     */
    public CompareFaceResponse CompareFace(CompareFaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CompareFaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CompareFaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CompareFace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to copy a person in a group to another group (without copying the description). One person can exist in up to 100 groups at the same time.
>     
- Note: if the version of the algorithm model was 2.0 when the person was created, the copy operation will fail if it is to copy to a group not on algorithm model v2.0.
     * @param req CopyPersonRequest
     * @return CopyPersonResponse
     * @throws TencentCloudSDKException
     */
    public CopyPersonResponse CopyPerson(CopyPersonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CopyPersonResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CopyPersonResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CopyPerson"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add a set of face images to a person. One person can have up to 5 images. If a person exists in multiple groups, the images will be added to all those groups for the person.

>     
- Please use the signature algorithm v3 to calculate the signature in the common parameters, that is, set the `SignatureMethod` parameter to `TC3-HMAC-SHA256`.
     * @param req CreateFaceRequest
     * @return CreateFaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateFaceResponse CreateFace(CreateFaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateFace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an empty group. If the group already exists, an error will be returned.
Custom description fields can be created as needed to describe persons in the group.

A maximum of 100,000 groups or 50 million faces can be created under one `APPID`.

The maximum number of faces that can be included in one group varies by algorithm model version (`FaceModelVersion`), which is 1 million for v2.0 or 3 million for v3.0.
     * @param req CreateGroupRequest
     * @return CreateGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateGroupResponse CreateGroup(CreateGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a person and add face, name, gender, and other related information.

>     
- Please use the signature algorithm v3 to calculate the signature in the common parameters, that is, set the `SignatureMethod` parameter to `TC3-HMAC-SHA256`.
     * @param req CreatePersonRequest
     * @return CreatePersonResponse
     * @throws TencentCloudSDKException
     */
    public CreatePersonResponse CreatePerson(CreatePersonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePersonResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePersonResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreatePerson"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete the face images of a person. If the person has only one face image, an error will be returned.
     * @param req DeleteFaceRequest
     * @return DeleteFaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFaceResponse DeleteFace(DeleteFaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteFaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteFace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a group and all persons in it. Meanwhile, all face information corresponding to the persons will be deleted. If a person exists in multiple groups at the same time, deleting a group will not delete the person, but the custom description field information in the group will be deleted. Custom description field information in other groups will not be affected.

     * @param req DeleteGroupRequest
     * @return DeleteGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGroupResponse DeleteGroup(DeleteGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a person from all groups. Meanwhile, all face information of the person will be deleted.
     * @param req DeletePersonRequest
     * @return DeletePersonResponse
     * @throws TencentCloudSDKException
     */
    public DeletePersonResponse DeletePerson(DeletePersonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePersonResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePersonResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeletePerson"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to remove a person from a specified group. This operation only affects the group. If the person exists only in the group, the person will be deleted, and all face information of the person will also be deleted.
     * @param req DeletePersonFromGroupRequest
     * @return DeletePersonFromGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeletePersonFromGroupResponse DeletePersonFromGroup(DeletePersonFromGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePersonFromGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePersonFromGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeletePersonFromGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to detect the position, attributes, and quality information of a face in the given image. The position information includes (x, y, w, h); the face attributes include gender, age, expression, beauty, glass, hair, mask, and pose (pitch, roll, yaw); and the face quality information includes the overall quality score, sharpness, brightness, and completeness.

 
The face quality information is mainly used to evaluate the quality of the input face image. When using the Face Recognition service, you are recommended to evaluate the quality of the input face image first to improve the effects of subsequent processing. Application scenarios of this feature include:

1). [Creating](https://cloud.tencent.com/document/product/867/32793)/[Adding](https://cloud.tencent.com/document/product/867/32795) a person in a group: this is to ensure the quality of the face information to facilitate subsequent processing.

2). [Face search](https://cloud.tencent.com/document/product/867/32798): this is to ensure the quality of the input image to quickly find the corresponding person.

3). [Face verification](https://cloud.tencent.com/document/product/867/32806): this is to ensure the quality of the face information to avoid cases where the verification incorrectly fails.

4). [Face fusion](https://cloud.tencent.com/product/facefusion): this is to ensure the quality of the uploaded face images to improve the fusion effect.

>     
- Please use the signature algorithm v3 to calculate the signature in the common parameters, that is, set the `SignatureMethod` parameter to `TC3-HMAC-SHA256`.


     * @param req DetectFaceRequest
     * @return DetectFaceResponse
     * @throws TencentCloudSDKException
     */
    public DetectFaceResponse DetectFace(DetectFaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetectFaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetectFaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetectFace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to detect the liveness of a user with a user-uploaded image. Its difference from video-based liveness detection lies in that the user does not need to speak, shake their head, or wink for detection.

Image-based liveness detection is suitable for scenarios where the image is a selfie or the requirement for attack defense is not high. If you have a higher security requirement for liveness detection, please use [Faceid](https://cloud.tencent.com/product/faceid).

>     
- The aspect ratio of the image should be close to 3:4 (width:height); otherwise, the score returned for the image will be meaningless. This API is suitable for selfie scenarios, and the score returned in other scenarios will be meaningless.

>     
- Please use the signature algorithm v3 to calculate the signature in the common parameters, that is, set the `SignatureMethod` parameter to `TC3-HMAC-SHA256`.
     * @param req DetectLiveFaceRequest
     * @return DetectLiveFaceResponse
     * @throws TencentCloudSDKException
     */
    public DetectLiveFaceResponse DetectLiveFace(DetectLiveFaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetectLiveFaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetectLiveFaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetectLiveFace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the estimated duration of a duplicate person check task.

If the `EndTimestamp` meets your expectations, please initiate the duplicate person check request as soon as possible; otherwise, the task may take more time.

If the estimated duration is more than 5 hours, the duplicate person check feature cannot be used.
     * @param req EstimateCheckSimilarPersonCostTimeRequest
     * @return EstimateCheckSimilarPersonCostTimeResponse
     * @throws TencentCloudSDKException
     */
    public EstimateCheckSimilarPersonCostTimeResponse EstimateCheckSimilarPersonCostTime(EstimateCheckSimilarPersonCostTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EstimateCheckSimilarPersonCostTimeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EstimateCheckSimilarPersonCostTimeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EstimateCheckSimilarPersonCostTime"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of duplicate person check tasks and sort them in reverse order by task creation time (i.e., the newest one is at the top)

Only data in the past year is retained.
     * @param req GetCheckSimilarPersonJobIdListRequest
     * @return GetCheckSimilarPersonJobIdListResponse
     * @throws TencentCloudSDKException
     */
    public GetCheckSimilarPersonJobIdListResponse GetCheckSimilarPersonJobIdList(GetCheckSimilarPersonJobIdListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetCheckSimilarPersonJobIdListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetCheckSimilarPersonJobIdListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetCheckSimilarPersonJobIdList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the group information.
     * @param req GetGroupInfoRequest
     * @return GetGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetGroupInfoResponse GetGroupInfo(GetGroupInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetGroupInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetGroupInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetGroupInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of groups.
     * @param req GetGroupListRequest
     * @return GetGroupListResponse
     * @throws TencentCloudSDKException
     */
    public GetGroupListResponse GetGroupList(GetGroupListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetGroupListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetGroupListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetGroupList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the information of a specified person, including name, gender, face, etc.
     * @param req GetPersonBaseInfoRequest
     * @return GetPersonBaseInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetPersonBaseInfoResponse GetPersonBaseInfo(GetPersonBaseInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPersonBaseInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetPersonBaseInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetPersonBaseInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the information of a specified person, including group, description, etc.
     * @param req GetPersonGroupInfoRequest
     * @return GetPersonGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetPersonGroupInfoResponse GetPersonGroupInfo(GetPersonGroupInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPersonGroupInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetPersonGroupInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetPersonGroupInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of persons in a specified group.
     * @param req GetPersonListRequest
     * @return GetPersonListResponse
     * @throws TencentCloudSDKException
     */
    public GetPersonListResponse GetPersonList(GetPersonListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPersonListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetPersonListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetPersonList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the number of persons in a specified group.
     * @param req GetPersonListNumRequest
     * @return GetPersonListNumResponse
     * @throws TencentCloudSDKException
     */
    public GetPersonListNumResponse GetPersonListNum(GetPersonListNumRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPersonListNumResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetPersonListNumResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetPersonListNum"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the result of the `CheckSimilarPerson` API.
     * @param req GetSimilarPersonResultRequest
     * @return GetSimilarPersonResultResponse
     * @throws TencentCloudSDKException
     */
    public GetSimilarPersonResultResponse GetSimilarPersonResult(GetSimilarPersonResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetSimilarPersonResultResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetSimilarPersonResultResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetSimilarPersonResult"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the name, tag, and custom description field of a group.
     * @param req ModifyGroupRequest
     * @return ModifyGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGroupResponse ModifyGroup(ModifyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the information of a person, including name, gender, etc. The changes of person name and gender will be synced to all the groups that contain the person.
     * @param req ModifyPersonBaseInfoRequest
     * @return ModifyPersonBaseInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPersonBaseInfoResponse ModifyPersonBaseInfo(ModifyPersonBaseInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPersonBaseInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPersonBaseInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyPersonBaseInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the description of a specified person in a group.
     * @param req ModifyPersonGroupInfoRequest
     * @return ModifyPersonGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPersonGroupInfoResponse ModifyPersonGroupInfo(ModifyPersonGroupInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPersonGroupInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPersonGroupInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyPersonGroupInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize top K persons in one or more groups who are similar to the person in a given image and rank the similarity in a descending order.

Up to 10 faces in an image can be recognized at a time, and up to 100 groups can be searched in at a time.

The maximum number of faces in a group that can be searched for at a time is subject to the group's algorithm model version (`FaceModelVersion`), which is 1 million for v2.0 or 3 million for v3.0.

This API recognizes each face of a person as an independent one. By contrast, the [SearchPersons](https://cloud.tencent.com/document/product/867/38881) and [SearchPersonsReturnsByGroup](https://cloud.tencent.com/document/product/867/38880) APIs fuse the features of all faces of a person; for example, if a person has 4 faces, they will fuse the features of the 4 faces and generate the summarized facial features of the person to make the search more accurate.


This API should be used together with the [CreateGroup API](https://cloud.tencent.com/document/product/867/32794).

>     
- Please use the signature algorithm v3 to calculate the signature in the common parameters, that is, set the `SignatureMethod` parameter to `TC3-HMAC-SHA256`.
     * @param req SearchFacesRequest
     * @return SearchFacesResponse
     * @throws TencentCloudSDKException
     */
    public SearchFacesResponse SearchFaces(SearchFacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchFacesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SearchFacesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SearchFaces"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize top K persons in one or more groups who are similar to the person in a given image, display the results **by group**, and rank the similarity within each group in a descending order.

Up to 10 faces in the image can be recognized at a time, and cross-group search is supported.

The maximum number of faces in a group that can be searched for at a time is subject to the group's algorithm model version (`FaceModelVersion`), which is 1 million for v2.0 or 3 million for v3.0.

This API recognizes each face of a person as an independent one. By contrast, the [SearchPersons](https://cloud.tencent.com/document/product/867/38881) and [SearchPersonsReturnsByGroup](https://cloud.tencent.com/document/product/867/38880) APIs fuse the features of all faces of a person; for example, if a person has 4 faces, they will fuse the features of the 4 faces and generate the summarized facial features of the person to make the search more accurate.

This API should be used together with the [CreateGroup API](https://cloud.tencent.com/document/product/867/32794).

>     
- Please use the signature algorithm v3 to calculate the signature in the common parameters, that is, set the `SignatureMethod` parameter to `TC3-HMAC-SHA256`.


     * @param req SearchFacesReturnsByGroupRequest
     * @return SearchFacesReturnsByGroupResponse
     * @throws TencentCloudSDKException
     */
    public SearchFacesReturnsByGroupResponse SearchFacesReturnsByGroup(SearchFacesReturnsByGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchFacesReturnsByGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SearchFacesReturnsByGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SearchFacesReturnsByGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize top K persons in one or more groups who are similar to the person in a given image and rank the similarity in a descending order.

Up to 10 faces in an image can be recognized at a time, and up to 100 groups can be searched in at a time.

The maximum number of faces in a group that can be searched for at a time is subject to the group's algorithm model version (`FaceModelVersion`), which is 1 million for v2.0 or 3 million for v3.0.

This API fuses the features of all faces of a person; for example, if a person has 4 faces, it will fuse the features of the 4 faces and generate the summarized facial features of the person to make the person search (i.e., judging whether the face image to be recognized is of a specified person) more accurate. By contrast, the [SearchFaces](https://cloud.tencent.com/document/product/867/32798) and [SearchFacesReturnsByGroup](https://cloud.tencent.com/document/product/867/38882) APIs recognize each face of a person as an independent one for search.

>     
- Please use the signature algorithm v3 to calculate the signature in the common parameters, that is, set the `SignatureMethod` parameter to `TC3-HMAC-SHA256`.
- This feature is available only to groups whose algorithm model version (`FaceModelVersion`) is 3.0.
     * @param req SearchPersonsRequest
     * @return SearchPersonsResponse
     * @throws TencentCloudSDKException
     */
    public SearchPersonsResponse SearchPersons(SearchPersonsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchPersonsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SearchPersonsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SearchPersons"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize top K persons in one or more groups who are similar to the person in a given image, display the results **by group**, and rank the similarity within each group in a descending order.

Up to 10 faces in the image can be recognized at a time, and cross-group search is supported.

The maximum number of faces in a group that can be searched for at a time is subject to the group's algorithm model version (`FaceModelVersion`), which is 1 million for v2.0 or 3 million for v3.0.

This API fuses the features of all faces of a person; for example, if a person has 4 faces, it will fuse the features of the 4 faces and generate the summarized facial features of the person to make the person search (i.e., judging whether the face image to be recognized is of a specified person) more accurate. By contrast, the [SearchFaces](https://cloud.tencent.com/document/product/867/32798) and [SearchFacesReturnsByGroup](https://cloud.tencent.com/document/product/867/38882) APIs recognize each face of a person as an independent one for search.
>     
- Please use the signature algorithm v3 to calculate the signature in the common parameters, that is, set the `SignatureMethod` parameter to `TC3-HMAC-SHA256`.
- This feature is available only to groups whose algorithm model version (`FaceModelVersion`) is 3.0.
     * @param req SearchPersonsReturnsByGroupRequest
     * @return SearchPersonsReturnsByGroupResponse
     * @throws TencentCloudSDKException
     */
    public SearchPersonsReturnsByGroupResponse SearchPersonsReturnsByGroup(SearchPersonsReturnsByGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchPersonsReturnsByGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SearchPersonsReturnsByGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SearchPersonsReturnsByGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to judge whether a person in an image corresponds to a given `PersonId`. For more information on `PersonId`, please see [CreateGroup](https://cloud.tencent.com/document/product/867/32794). 

Unlike the [CompareFace](https://cloud.tencent.com/document/product/867/32802) API that is used to judge the similarity between two faces, this API is used to judge "whether the person in the image is someone specified" whose information is stored in a group. This "someone" may have multiple face images.

This API recognizes each face of a person as an independent one. By contrast, the [VerifyPerson](https://cloud.tencent.com/document/product/867/38879) API fuses the features of all faces of a person; for example, if a person has 4 faces, it will fuse the features of the 4 faces and generate the summarized facial features of the person to make the person verification (i.e., judging whether the face image to be recognized is of a specified person) more accurate.

>     
- Please use the signature algorithm v3 to calculate the signature in the common parameters, that is, set the `SignatureMethod` parameter to `TC3-HMAC-SHA256`.
     * @param req VerifyFaceRequest
     * @return VerifyFaceResponse
     * @throws TencentCloudSDKException
     */
    public VerifyFaceResponse VerifyFace(VerifyFaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyFaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyFaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "VerifyFace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to judge whether a person in an image corresponds to a given `PersonId`. For more information on `PersonId`, please see [CreateGroup](https://cloud.tencent.com/document/product/867/32794).
This API fuses the features of all faces of a person; for example, if a person has 4 faces, it will fuse the features of the 4 faces and generate the summarized facial features of the person to make the person verification (i.e., judging whether the face image to be recognized is of a specified person) more accurate.

 Unlike the `CompareFace` API that is used to judge the similarity between two faces, this API is used to judge "whether the person in the image is someone specified" whose information is stored in a group. This "someone" may have multiple face images.


>     
- Please use the signature algorithm v3 to calculate the signature in the common parameters, that is, set the `SignatureMethod` parameter to `TC3-HMAC-SHA256`.
- This feature is available only to groups whose algorithm model version (`FaceModelVersion`) is 3.0.
     * @param req VerifyPersonRequest
     * @return VerifyPersonResponse
     * @throws TencentCloudSDKException
     */
    public VerifyPersonResponse VerifyPerson(VerifyPersonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyPersonResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyPersonResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "VerifyPerson"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
