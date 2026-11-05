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
    private static String endpoint = "iai.intl.tencentcloudapi.com";
    private static String service = "iai";
    private static String version = "2020-03-03";

    public IaiClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IaiClient(Credential credential, String region, ClientProfile profile) {
        super(IaiClient.endpoint, IaiClient.version, credential, region, profile);
    }

    /**
     *This API is used to perform facial feature localization (aka facial keypoint localization) on a given image and calculate 90 facial keypoints that make up the contour of the face, including eyebrows (8 points on the left and 8 on the right), eyes (8 points on the left and 8 on the right), nose (13 points), mouth (22 points), face contour (21 points), and eyeballs or pupils (2 points).

>- Please use the signature algorithm v3 to calculate the signature in the common parameters, that is, set the `SignatureMethod` parameter to `TC3-HMAC-SHA256`.
     * @param req AnalyzeFaceRequest
     * @return AnalyzeFaceResponse
     * @throws TencentCloudSDKException
     */
    public AnalyzeFaceResponse AnalyzeFace(AnalyzeFaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AnalyzeFace", AnalyzeFaceResponse.class);
    }

    /**
     *This API is used to calculate the similarity of faces in two images and return the face similarity score.

If you need to judge "whether the person in the image is someone specified" in scenarios such as face login, i.e., checking whether the person in a given image is someone with a known identity, we recommend using the [VerifyFace](https://intl.cloud.tencent.com/document/product/867/44983?from_cn_redirect=1) or [VerifyPerson](https://intl.cloud.tencent.com/document/product/867/44982?from_cn_redirect=1) API.

>     
- Please use the signature algorithm v3 to calculate the signature in the common parameters, that is, set the `SignatureMethod` parameter to `TC3-HMAC-SHA256`.
     * @param req CompareFaceRequest
     * @return CompareFaceResponse
     * @throws TencentCloudSDKException
     */
    public CompareFaceResponse CompareFace(CompareFaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CompareFace", CompareFaceResponse.class);
    }

    /**
     *This API is used to copy a person in a group to another group (without copying the description). One person can exist in up to 100 groups at the same time.
>- Note: in the case that the version of the algorithm model was 2.0 when the person was created, the copy operation will fail if the target group is not of algorithm model 2.0.
     * @param req CopyPersonRequest
     * @return CopyPersonResponse
     * @throws TencentCloudSDKException
     */
    public CopyPersonResponse CopyPerson(CopyPersonRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyPerson", CopyPersonResponse.class);
    }

    /**
     *Add a group of human face images to a person. A person allows up to 5 images. If the person exists across multiple person libraries, the images will be added to the person in ALL libraries.

>     
- For the signature method in public parameters, please use the V3 version. In other words, set the SignatureMethod parameter to TC3-HMAC-SHA256.
     * @param req CreateFaceRequest
     * @return CreateFaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateFaceResponse CreateFace(CreateFaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFace", CreateFaceResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGroup", CreateGroupResponse.class);
    }

    /**
     *Create a person and add a human face, name, sex, and other information related to the person.

>     
- Please use the V3 version of the signature method in public parameters. In other words, set the SignatureMethod parameter to TC3-HMAC-SHA256.
     * @param req CreatePersonRequest
     * @return CreatePersonResponse
     * @throws TencentCloudSDKException
     */
    public CreatePersonResponse CreatePerson(CreatePersonRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePerson", CreatePersonResponse.class);
    }

    /**
     *This API is used to delete the face images of a person. If the person has only one face image, an error will be returned.
     * @param req DeleteFaceRequest
     * @return DeleteFaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFaceResponse DeleteFace(DeleteFaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFace", DeleteFaceResponse.class);
    }

    /**
     *This API is used to delete a group and all persons in it. Meanwhile, all face information corresponding to the persons will be deleted. If a person exists in multiple groups at the same time, deleting a group will not delete the person, but the custom description field information in the group will be deleted. Custom description field information in other groups will not be affected.

     * @param req DeleteGroupRequest
     * @return DeleteGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGroupResponse DeleteGroup(DeleteGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGroup", DeleteGroupResponse.class);
    }

    /**
     *This API is used to delete a person from all groups. Meanwhile, all face information of the person will be deleted.
     * @param req DeletePersonRequest
     * @return DeletePersonResponse
     * @throws TencentCloudSDKException
     */
    public DeletePersonResponse DeletePerson(DeletePersonRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePerson", DeletePersonResponse.class);
    }

    /**
     *This API is used to remove a person from a specified group. This operation only affects the group. If the person exists only in the group, the person will be deleted, and all face information of the person will also be deleted.
     * @param req DeletePersonFromGroupRequest
     * @return DeletePersonFromGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeletePersonFromGroupResponse DeletePersonFromGroup(DeletePersonFromGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePersonFromGroup", DeletePersonFromGroupResponse.class);
    }

    /**
     *This API is used to detect the position, attributes, and quality information of a face in the given image. The position information includes (x, y, w, h); the face attributes include gender, age, expression, beauty, glass, hair, mask, and pose (pitch, roll, yaw); and the face quality information includes the overall quality score, sharpness, brightness, and completeness.

 
The face quality information is mainly used to evaluate the quality of the input face image. When using the Face Recognition service, we recommend evaluating the quality of the input face image first to improve the effects of subsequent processing. Application scenarios of this feature include:

1. [Creating](https://intl.cloud.tencent.com/document/product/867/45014?from_cn_redirect=1)/[Adding](https://intl.cloud.tencent.com/document/product/867/45016?from_cn_redirect=1) a person in a group: this is to ensure the quality of the face information to facilitate subsequent processing.

2. [Face search](https://intl.cloud.tencent.com/document/product/867/44994?from_cn_redirect=1): this is to ensure the quality of the input image to quickly find the corresponding person.

3. [Face verification](https://intl.cloud.tencent.com/document/product/867/44983?from_cn_redirect=1): this is to ensure the quality of the face information to avoid cases where the verification incorrectly fails.

4. Face fusion: this is to ensure the quality of the uploaded face images to improve the fusion effect.

>- Please use the signature algorithm v3 to calculate the signature in the common parameters, that is, set the `SignatureMethod` parameter to `TC3-HMAC-SHA256`.
     * @param req DetectFaceRequest
     * @return DetectFaceResponse
     * @throws TencentCloudSDKException
     */
    public DetectFaceResponse DetectFace(DetectFaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetectFace", DetectFaceResponse.class);
    }

    /**
     *This API is used to detect the position, attributes, and quality information of a face in the given image. The position information includes (x, y, w, h); the face attributes include gender, age, expression, beauty, glass, hair, mask, and pose (pitch, roll, yaw); and the face quality information includes the overall quality score, sharpness, brightness, and completeness.

 
The face quality information is mainly used to evaluate the quality of the input face image. When using the Face Recognition service, we recommend evaluating the quality of the input face image first to improve the effects of subsequent processing. Application scenarios of this feature include:

1. [Creating](https://intl.cloud.tencent.com/document/api/1059/36964)/[Adding](https://intl.cloud.tencent.com/document/api/1059/36966) a person in a group: This is to ensure the quality of the face information to facilitate subsequent processing.

2. [Face search](https://intl.cloud.tencent.com/document/api/1059/36977): This is to ensure the quality of the input image to quickly find the corresponding person.

3. [Face verification](https://intl.cloud.tencent.com/document/api/1059/36972): This is to ensure the quality of the face information to avoid cases where the verification fails unexpectedly.

4. Face fusion: This is to ensure the quality of the uploaded face images to improve the fusion effect.

>     
- This API is an upgrade of [DetectFace](https://intl.cloud.tencent.com/document/api/1059/36979); specifically:
1. This API can be used to specify the face attributes that need to be computed and returned, which avoids ineffective computation and reduces time consumption.
2. This API supports more detailed attribute items and will continue providing new features in the future.
Use this API for corresponding face detection and attribute analysis.

>     
- Use the signature algorithm v3 to calculate the signature in the common parameters, that is, set the parameter `SignatureMethod` to `TC3-HMAC-SHA256`.
     * @param req DetectFaceAttributesRequest
     * @return DetectFaceAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DetectFaceAttributesResponse DetectFaceAttributes(DetectFaceAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetectFaceAttributes", DetectFaceAttributesResponse.class);
    }

    /**
     *This API is used to perform similarity comparison between human faces in two images and return the facial similarity score.

If you need to judge whether a person is a specific individual, that is, to verify whether a person in an image is a known identity, for example in common log in scenarios such as face verification, we recommend using the face verification (https://www.tencentcloud.com/document/product/867/44983?from_cn_redirect=1) or person verification (https://www.tencentcloud.com/document/product/867/44982?from_cn_redirect=1) api.

>     
- Please use the V3 version for the signature method in the public parameters. In other words, set the SignatureMethod parameter to TC3-HMAC-SHA256.
     * @param req DetectFaceSimilarityRequest
     * @return DetectFaceSimilarityResponse
     * @throws TencentCloudSDKException
     */
    public DetectFaceSimilarityResponse DetectFaceSimilarity(DetectFaceSimilarityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetectFaceSimilarity", DetectFaceSimilarityResponse.class);
    }

    /**
     *This API is used to perform anti-rephotograph liveness detection on user-uploaded static images to determine whether they are rephotographs.

Compared with existing static liveness detection services, the high-precision version enhances defense against attacks such as HD screens, cropped paper, and 3D masks while maintaining a high real person pass rate. Its attack interception rate is about 4-5 times that of similar types of products in the industry. It also supports face verification in different use cases, meets image-based liveness detection requirements for various scenarios on mobile and PC, and is applicable to different liveness detection applications across industries.

The face static liveness detection (high-precision version) API officially starts billing from 00:00 on August 1, 2022, using the postpaid pay-as-you-go billing mode. For details, see Billing Overview (https://www.tencentcloud.com/document/product/867/17640?from_cn_redirect=1).
     * @param req DetectLiveFaceAccurateRequest
     * @return DetectLiveFaceAccurateResponse
     * @throws TencentCloudSDKException
     */
    public DetectLiveFaceAccurateResponse DetectLiveFaceAccurate(DetectLiveFaceAccurateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetectLiveFaceAccurate", DetectLiveFaceAccurateResponse.class);
    }

    /**
     *This API is used to get the group information.
     * @param req GetGroupInfoRequest
     * @return GetGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetGroupInfoResponse GetGroupInfo(GetGroupInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetGroupInfo", GetGroupInfoResponse.class);
    }

    /**
     *This API is used to get the list of groups.
     * @param req GetGroupListRequest
     * @return GetGroupListResponse
     * @throws TencentCloudSDKException
     */
    public GetGroupListResponse GetGroupList(GetGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetGroupList", GetGroupListResponse.class);
    }

    /**
     *This API is used to get the information of a specified person, including name, gender, face, etc.
     * @param req GetPersonBaseInfoRequest
     * @return GetPersonBaseInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetPersonBaseInfoResponse GetPersonBaseInfo(GetPersonBaseInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetPersonBaseInfo", GetPersonBaseInfoResponse.class);
    }

    /**
     *This API is used to get the information of a specified person, including group, description, etc.
     * @param req GetPersonGroupInfoRequest
     * @return GetPersonGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetPersonGroupInfoResponse GetPersonGroupInfo(GetPersonGroupInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetPersonGroupInfo", GetPersonGroupInfoResponse.class);
    }

    /**
     *This API is used to get the list of persons in a specified group.
     * @param req GetPersonListRequest
     * @return GetPersonListResponse
     * @throws TencentCloudSDKException
     */
    public GetPersonListResponse GetPersonList(GetPersonListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetPersonList", GetPersonListResponse.class);
    }

    /**
     *This API is used to get the number of persons in a specified group.
     * @param req GetPersonListNumRequest
     * @return GetPersonListNumResponse
     * @throws TencentCloudSDKException
     */
    public GetPersonListNumResponse GetPersonListNum(GetPersonListNumRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetPersonListNum", GetPersonListNumResponse.class);
    }

    /**
     *This API is used to modify the name, tag, and custom description field of a group.
     * @param req ModifyGroupRequest
     * @return ModifyGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGroupResponse ModifyGroup(ModifyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGroup", ModifyGroupResponse.class);
    }

    /**
     *This API is used to modify the description of a specified person in a group.
     * @param req ModifyPersonGroupInfoRequest
     * @return ModifyPersonGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPersonGroupInfoResponse ModifyPersonGroupInfo(ModifyPersonGroupInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPersonGroupInfo", ModifyPersonGroupInfoResponse.class);
    }

    /**
     *This API is used to recognize the top K most similar persons in one or more person libraries for a face image to be recognized, and sort the recognition results by similarity in descending order.

This API is used to recognize up to 10 human faces in an image at a time and search across 100 person libraries at a time.

The total number of human faces in a person library for a single search is related to the algorithm model version of the person library. For a person library with algorithm model version 2.0, the total number of human faces in a single search should not exceed 1 million. For a person library with algorithm model version 3.0, the total number of human faces in a single search should not exceed 3 million.

Unlike the [Person search](https://www.tencentcloud.com/document/product/867/44992?from_cn_redirect=1) and [Person search by database return](https://www.tencentcloud.com/document/product/867/44991?from_cn_redirect=1) APIs, this API verifies each Face under a Person as a separate individual. The Person search and Person search by database return APIs perform fusion feature processing on all faces under a Person. For example, if a Person has 4 faces, the [Person search](https://www.tencentcloud.com/document/product/867/44992?from_cn_redirect=1) and [Person search by database return](https://www.tencentcloud.com/document/product/867/44991?from_cn_redirect=1) APIs will fuse the features of the 4 faces to generate the characteristics of this Person, making the search more accurate.


This interface should be used in conjunction with the personnel database management API (https://www.tencentcloud.com/document/product/867/45015?from_cn_redirect=1).

**Note:** If a person library has not been called for over 1 year, the platform will delete its resources to ensure user information security.

>     
- Use the V3 signature method in public parameters. In other words, set the SignatureMethod parameter to TC3-HMAC-SHA256.

>     
-Cannot search person libraries of different algorithm model versions (FaceModelVersion) at the same time.
     * @param req SearchFacesRequest
     * @return SearchFacesResponse
     * @throws TencentCloudSDKException
     */
    public SearchFacesResponse SearchFaces(SearchFacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchFaces", SearchFacesResponse.class);
    }

    /**
     *This API is used to recognize top K persons in one or more groups who are similar to the person in a given image, display the results **by group**, and rank the similarity within each group in descending order.

Up to 10 faces in the image can be recognized at a time, and cross-group search is supported.

The maximum number of faces in groups that can be searched for at a time is subject to the group's algorithm model version (`FaceModelVersion`), which is 1 million for v2.0 or 3 million for v3.0.

This API recognizes each face image of a person as an independent one. By contrast, the [SearchPersons](https://intl.cloud.tencent.com/document/product/867/44992?from_cn_redirect=1) and [SearchPersonsReturnsByGroup](https://intl.cloud.tencent.com/document/product/867/44991?from_cn_redirect=1) APIs fuse the features of all face images of a person; for example, if a person has 4 face images, they will fuse the features of the 4 face images and generate the summarized facial features of the person to make the search more accurate.

This API should be used together with [Group Management APIs](https://intl.cloud.tencent.com/document/product/867/45015?from_cn_redirect=1).

>     
- Please use the signature algorithm v3 to calculate the signature in the common parameters, that is, set the `SignatureMethod` parameter to `TC3-HMAC-SHA256`.

>     
- You cannot search for groups using different algorithm model versions (`FaceModelVersion`) at a time.

     * @param req SearchFacesReturnsByGroupRequest
     * @return SearchFacesReturnsByGroupResponse
     * @throws TencentCloudSDKException
     */
    public SearchFacesReturnsByGroupResponse SearchFacesReturnsByGroup(SearchFacesReturnsByGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchFacesReturnsByGroup", SearchFacesReturnsByGroupResponse.class);
    }

    /**
     *This API is used to recognize the top K most similar persons in one or more person libraries for a face image to be recognized, and sort them by similarity in descending order.

This API is used to recognize up to 10 human faces in an image at a time and search across 100 person libraries at a time.

The total number of faces in a person library for a single search is related to the algorithm model version of the person library. For a person library with algorithm model version 2.0, the total number of faces in a single search should not exceed 1 million. For a person library with algorithm model version 3.0, the total number of faces in a single search should not exceed 3 million.

This API is used to perform fusion feature processing on all faces under a Person. For example, if a Person has 4 faces, this API will fuse the features of the 4 faces to generate the corresponding features of this Person, making Person search (confirming that the Face image to be identified belongs to a certain Person) more accurate. In contrast, [Face search](https://www.tencentcloud.com/document/product/867/44994?from_cn_redirect=1) and [Face search by group return API](https://www.tencentcloud.com/document/product/867/44993?from_cn_redirect=1) search for each Face under the Person as a separate individual.
**Note:** If a person library has no calls for more than 1 year, the platform will delete its resources to ensure User Information Security.
>     
- Use the V3 signature method in public parameters. In other words, set the SignatureMethod parameter to TC3-HMAC-SHA256.
-Only person libraries with algorithm model version (FaceModelVersion) 3.0 are supported.
     * @param req SearchPersonsRequest
     * @return SearchPersonsResponse
     * @throws TencentCloudSDKException
     */
    public SearchPersonsResponse SearchPersons(SearchPersonsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchPersons", SearchPersonsResponse.class);
    }

    /**
     *This API is used to recognize top K persons in one or more groups who are similar to the person in a given image, display the results **by group**, and rank the similarity within each group in a descending order.

Up to 10 faces in the image can be recognized at a time, and cross-group search is supported.

The maximum number of faces in groups that can be searched for at a time is subject to the group's algorithm model version (`FaceModelVersion`), which is 1 million for v2.0 or 3 million for v3.0.

This API fuses the features of all face images of a person; for example, if a person has 4 face images, it will fuse the features of the 4 face images and generate the summarized facial features of the person to make the person search (i.e., judging whether the face image to be recognized is of a specified person) more accurate. By contrast, the [SearchFaces](https://intl.cloud.tencent.com/document/product/867/44994?from_cn_redirect=1) and [SearchFacesReturnsByGroup](https://intl.cloud.tencent.com/document/product/867/44993?from_cn_redirect=1) APIs recognize each face image of a person as an independent one for search.
>     
- Please use the signature algorithm v3 to calculate the signature in the common parameters, that is, set the `SignatureMethod` parameter to `TC3-HMAC-SHA256`.
- This feature is available only to groups whose algorithm model version (`FaceModelVersion`) is 3.0.
     * @param req SearchPersonsReturnsByGroupRequest
     * @return SearchPersonsReturnsByGroupResponse
     * @throws TencentCloudSDKException
     */
    public SearchPersonsReturnsByGroupResponse SearchPersonsReturnsByGroup(SearchPersonsReturnsByGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchPersonsReturnsByGroup", SearchPersonsReturnsByGroupResponse.class);
    }

    /**
     *This API is used to judge whether a person in an image corresponds to a given `PersonId`. For more information on `PersonId`, please see [Group Management APIs](https://intl.cloud.tencent.com/document/product/867/45015?from_cn_redirect=1). 

The `VerifyFace` API judges whether a person is someone specified whose information is stored in a group, and there may be multiple face images of "someone". By contrast, the [CompareFace](https://intl.cloud.tencent.com/document/product/867/44987?from_cn_redirect=1) API judges the similarity between two faces.

This API recognizes each face image of a person as an independent one. By contrast, the [VerifyPerson](https://intl.cloud.tencent.com/document/product/867/44982?from_cn_redirect=1) API fuses the features of all face images of a person; for example, if a person has 4 face images, the VerifyPerson API will fuse the features of the 4 face images and generate the summarized facial features of the person to make the person verification (i.e., judging whether the face image to be recognized is of a specified person) more accurate.

>     
- Please use the signature algorithm v3 to calculate the signature in the common parameters, that is, set the parameter `SignatureMethod` to `TC3-HMAC-SHA256`.
     * @param req VerifyFaceRequest
     * @return VerifyFaceResponse
     * @throws TencentCloudSDKException
     */
    public VerifyFaceResponse VerifyFace(VerifyFaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyFace", VerifyFaceResponse.class);
    }

    /**
     *This API is used to judge whether a person in an image corresponds to a given `PersonId`. For more information on `PersonId`, please see [Group Management APIs](https://intl.cloud.tencent.com/document/product/867/45015?from_cn_redirect=1).
This API fuses the features of all face images of a person; for example, if a person has 4 face images, it will fuse the features of the 4 face images and generate the summarized facial features of the person to make the person verification (i.e., judging whether the face image to be recognized is of a specified person) more accurate.

 The face verification APIs judge whether a person is someone specified whose information is stored in a group, and the "someone" may have multiple face images. By contrast, the face comparison APIs judge the similarity between two faces.


>     
- Please use the signature algorithm v3 to calculate the signature in the common parameters, that is, set the `SignatureMethod` parameter to `TC3-HMAC-SHA256`.
- This feature is available only to groups whose algorithm model version (`FaceModelVersion`) is 3.0.
     * @param req VerifyPersonRequest
     * @return VerifyPersonResponse
     * @throws TencentCloudSDKException
     */
    public VerifyPersonResponse VerifyPerson(VerifyPersonRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyPerson", VerifyPersonResponse.class);
    }

}
