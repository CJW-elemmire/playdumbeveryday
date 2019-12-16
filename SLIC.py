import cv2
import math

class SLIC(object):
    def __init__(self, K, M):
        self.K = K
        self.M = M
        self.labels[]
        self.centers[]
        self.img = self.readimg()
        self.height, self.width = self.img.height, self.img.width
        self.step = math.sqrt(self.img.height*self.img.width/self.K)

    def readimg(img):
        return cv2.cvtColor(img, cv2.COLOR_BGR2LAB)

    def initial(self):
        for i in range(self.step, self.height, self.step):
            for j in range(self.step, self.width, self.step):
                
